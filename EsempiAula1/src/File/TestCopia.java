package File;

import java.io.*;
public class TestCopia {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\vince\\OneDrive\\Desktop\\Read1.txt");
		BufferedReader in = new BufferedReader(file);
		String line;
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\vince\\OneDrive\\Desktop\\Write1.txt"));
		while ((line = in.readLine()) != null)
			out.println(line);
		in.close();
		out.close();
	}
}