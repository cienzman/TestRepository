package Exceptions;

//esempio in cui si intercettano due eccezioni controllate.
import java.io.*;
public class Copy {
	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("Primo");
			FileWriter out = new FileWriter("secondo");
			int c;
			while ((c = in.read()) != -1)
				out.write(c);
			in.close(); out.close();
		}/*catch(FileNotFoundException e) {
System.err.println(e.getMessage());
System.exit(1);
}
		 */
		catch(IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}

	}
}