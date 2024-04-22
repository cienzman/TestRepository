import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GestoreResiGUI extends JFrame {
    private JComboBox<IRendibile> ordiniComboBox;
    private List<IRendibile> ordini; /*l'uso di una lista (List) offre solitamente maggiore 
    flessibilità  nella gestione dei dati dinamici, poiché le liste possono essere 
    facilmente modificate (aggiunta, rimozione di elementi) mentre gli array hanno
     una dimensione fissa.*/

    public GestoreResiGUI(List<IRendibile> ordini) {
        this.ordini = ordini;

        setTitle("Gestore Resi");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initComponents();
        pack();
        setLocationRelativeTo(null); // Posiziona la finestra al centro dello schermo
        setVisible(true);
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        ordiniComboBox = new JComboBox<>(ordini.toArray(new IRendibile[0])); 
        /*crea un nuovo array di tipo IRendibile e lo riempie con gli elementi della lista ordini.
         * crea un nuovo oggetto JComboBox e lo inizializza con gli elementi dell'array
         *  creato nel passo precedente. Il <IRendibile> tra parentesi angolari 
         *  indica il tipo di elementi contenuti nell'oggetto JComboBox.*/
        mainPanel.add(ordiniComboBox);

        JButton resoButton = new JButton("RESO");
        resoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IRendibile ordineSelezionato = (IRendibile) ordiniComboBox.getSelectedItem();
                //estrae l'elemento selezionato dal JComboBox chiamato ordiniComboBox 
                //e lo memorizza in una variabile di tipo IRendibile chiamata ordineSelezionato.
                if (ordineSelezionato != null) {
                    mostraDialogoReso((Ordine) ordineSelezionato);
                } else {
                    JOptionPane.showMessageDialog(GestoreResiGUI.this, "Seleziona un ordine per effettuare il reso.", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        mainPanel.add(resoButton);

        add(mainPanel, BorderLayout.CENTER);
    }

    private void mostraDialogoReso(IRendibile ordine) {
        List<Prodotto> prodottiOrdine = ordine.getProdottiRendibili(); //mette in prodottiOrdine i prodotti di quell'ordine
        JCheckBox[] prodottoCheckBoxes = new JCheckBox[prodottiOrdine.size()]; //crea un array di check box grande quanto il numero di prodotti

        JPanel prodottiPanel = new JPanel();
        prodottiPanel.setLayout(new GridLayout(prodottiOrdine.size(), 1));

        String[] motivazioni = {"Ho cambiato idea", "Articolo difettoso", "Altro"};

        for (int i = 0; i < prodottiOrdine.size(); i++) {
            Prodotto prodotto = prodottiOrdine.get(i);
            JPanel prodottoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

            JCheckBox checkBox = new JCheckBox(prodotto.toString()); //crea un checkbox con il nome del prodotto
            prodottoPanel.add(checkBox);
            prodottoCheckBoxes[i] = checkBox; //mette quel checkbox creato nell'array di checkbox

            JComboBox<String> motivazioniComboBox = new JComboBox<>(motivazioni); //crea una combo box con le motivazioni
            prodottoPanel.add(motivazioniComboBox);

            prodottiPanel.add(prodottoPanel);
        }

        int result = JOptionPane.showConfirmDialog(this, prodottiPanel, "Seleziona i prodotti per il reso", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Reso reso = new Reso(ordine);
            for (int i = 0; i < prodottoCheckBoxes.length; i++) {
                if (prodottoCheckBoxes[i].isSelected()) {
                    Prodotto prodotto = prodottiOrdine.get(i);
                    String motivazione = (String) ((JComboBox<?>) ((JPanel) prodottiPanel.getComponent(i)).getComponent(1)).getSelectedItem();
                    prodotto.setMotivazioneReso(motivazione);
                    reso.aggiungiProdotto(prodotto);
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Prodotti selezionati per il reso:\n");
            for (Prodotto prodotto : reso.getProdottiDaRendere()) {
                sb.append(prodotto.getNome()).append(" - Motivazione: ").append(prodotto.getMotivazioneReso()).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Prodotti per il reso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Creazione di alcuni ordini di prova con relativi prodotti
        List<Prodotto> prodottiOrdine1 = new ArrayList<>();
        prodottiOrdine1.add(new Prodotto("Prodotto 1", 10.0));
        prodottiOrdine1.add(new Prodotto("Prodotto 2", 20.0));
        Ordine ordine1 = new Ordine("Ordine 1", prodottiOrdine1);

        List<Prodotto> prodottiOrdine2 = new ArrayList<>();
        prodottiOrdine2.add(new Prodotto("Prodotto 3", 30.0));
        prodottiOrdine2.add(new Prodotto("Prodotto 4", 40.0));
        Ordine ordine2 = new Ordine("Ordine 2", prodottiOrdine2);

        List<IRendibile> ordini = new ArrayList<>();
        ordini.add(ordine1);
        ordini.add(ordine2);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestoreResiGUI(ordini);
            }
        });
    }
}