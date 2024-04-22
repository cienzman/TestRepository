import java.util.ArrayList;
import java.util.List;

class Reso {
    private IRendibile ordine;
    private List<Prodotto> prodottiDaRendere;

    public Reso(IRendibile ordine) {
        this.ordine = ordine;
        this.prodottiDaRendere = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        prodottiDaRendere.add(prodotto);
    }

    public List<Prodotto> getProdottiDaRendere() {
        return prodottiDaRendere;
    }
}