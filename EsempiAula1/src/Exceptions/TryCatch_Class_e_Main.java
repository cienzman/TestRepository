package Exceptions;

//esempio di gestione di eccezione in un punto diverso da quello in
//cui l’eccezione viene generata.
public class TryCatch_Class_e_Main {
	static int calc(int num1, int num2, int div) {
		if(div == 0)
			throw new IllegalArgumentException("Divisore non valido!");
		int val = (num1 + num2)/div;
		return val;
	}
	static public void main(String[] args) {
		int val1 = 100;
		int val2 = 20;
		int ris = 0;
		int div = 0;
		try {
			ris = calc(val1, val2, div);
			System.out.println(ris);
		} catch (IllegalArgumentException e){
			//System.err.println(e.getMessage()); //in rosso
			System.out.println(e.getMessage()); //in nero
		}
	}
}