package File;

import java.io.*;
public class TestLettura {
	public static void main(String[] args)
			throws IOException {
		FileReader file = new FileReader("C:\\Users\\vince\\OneDrive\\Desktop\\Read1.txt");
		BufferedReader in = new BufferedReader(file);
		String line;
		while ((line = in.readLine()) != null)
			System.out.println(line);
		in.close();
	}
}
