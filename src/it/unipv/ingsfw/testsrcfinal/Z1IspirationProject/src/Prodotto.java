
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



class Prodotto {
    private String nome;
    private double prezzo;
    private String motivazioneReso;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getMotivazioneReso() {
        return motivazioneReso;
    }

    public void setMotivazioneReso(String motivazioneReso) {
        this.motivazioneReso = motivazioneReso;
    }

    @Override
    public String toString() {
        return nome + " - Prezzo: " + prezzo;
    }
}