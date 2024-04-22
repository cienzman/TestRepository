package Supermercato;

public class Prodotto {
	String descrizione, codice;
	float prezzo;
	public Prodotto(String descr, float prezzo, String codice){
		this.descrizione = descr;
		this.prezzo = prezzo;
		this.codice = codice;
	}
	public String getDescrizione() { return descrizione; }
	public float getPrezzo() { return prezzo; }
	public String getCodice() { return codice; }
}
