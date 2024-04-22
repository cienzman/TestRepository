// esempio in cui non si gestisce l’eccezione controllata,
// ma si segnala che l’applicazione può generarla (throws).
package Exceptions;
import java.io.*;
public class CopyBytes {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream(args[0]);
		FileOutputStream out = new FileOutputStream(args[1]);
		int c;
		while ((c = in.read()) != -1)
			out.write(c);
		in.close();
		out.close();
	}
}
