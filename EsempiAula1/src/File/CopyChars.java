package File;

import java.io.*;
public class CopyChars {
	public static void main(String[] args)
			throws IOException {
		FileReader in = new FileReader("C:\\Users\\vince\\OneDrive\\Desktop\\Read1.txt");
		FileWriter out = new FileWriter("C:\\Users\\vince\\OneDrive\\Desktop\\Write1.txt");
		int c;
		while ((c = in.read()) != -1)
			out.write(c);
		in.close();
		out.close();
	}
}
