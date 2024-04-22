package File;

import java.io.*;
public class CopyBytes {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\vince\\OneDrive\\Desktop\\Photo1.png");
		FileOutputStream out = new FileOutputStream("C:\\Users\\vince\\OneDrive\\Desktop\\Write1.txt");
		int c;
		while ((c = in.read()) != -1)
			out.write(c);
		in.close();
		out.close();
	}
}