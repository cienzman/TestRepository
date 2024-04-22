package Supermercato;

import java.io.*;
import java.util.StringTokenizer;

public class Supermercato {
	private Prodotto lista[];
	private int nProd;
	public Supermercato(String file) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(file));
		int n = Integer.parseInt(in.readLine());
		lista = new Prodotto[n];
		nProd = 0;
		for(int i=0; i<n; i++) {
			String riga = in.readLine();
			String descr = riga.substring(0, 35);
			StringTokenizer st = new StringTokenizer(riga.substring(35));
			String codice = st.nextToken();
			float prezzo = Float.parseFloat(st.nextToken());
			if (!aggiungi(new Prodotto(descr, prezzo, codice)))
				break;
		}
	}
	public boolean aggiungi(Prodotto p){
		if (nProd < lista.length) {
			lista[nProd] = p;
			nProd++;
			return true;
		}
		return false;
	}
	public void stampaElenco(String file) throws IOException{
		PrintWriter out =
				new PrintWriter(new FileWriter(file));
		out.print(this);
		out.close();
	}
}