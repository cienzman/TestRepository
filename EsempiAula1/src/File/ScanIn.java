package File;

import java.io.*;
import java.util.Scanner;
public class ScanIn {
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		Scanner sc= null;
		try {
			s = new Scanner(new BufferedReader(new FileReader("C:\\\\Users\\\\vince\\\\OneDrive\\\\Desktop\\\\Write1.txt")));
			while (s.hasNext()) {
				System.out.println(s.next());
				sc = new Scanner(System.in);
				int i = sc.nextInt();
			}
		} finally {
			if (s != null) {
				s.close();
				sc.close();
			}
		}
	}
}
