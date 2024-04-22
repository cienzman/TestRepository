package Exceptions;

public class TryCatch_con_ripristino {

	static int calc(int num1, int num2, int div) {
		if(div == 0)
			throw new IllegalArgumentException("Divisore non valido");
		int val = (num1 + num2)/div;
		return val;
	}
	static public void main(String[] args) {
		int val1 = 100, val2 = 20 , ris = 0 ;
		System.out.println("Inserisci un valore: Ho inserito DIV=0 " );
		int div = 0;
		try {
			ris = calc(val1, val2, div);
			System.out.println(ris);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			System.out.println("Inserisci un altro valore: Ho inserito DIV=1 ");
			div = 1;
		}
	}
}
