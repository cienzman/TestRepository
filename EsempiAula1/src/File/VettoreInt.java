package File;
import java.io.*;
public class VettoreInt {
	private int v[] = new int[100];
	private int dim;

	public void leggi(String nomefile) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(nomefile));
		int i = 0;
		String line;
		while (i < 100 && (line = in.readLine()) != null){
			v[i] = Integer.parseInt(line);
			//v[i]=line;

			i++;
		}
		dim = i;
		in.close();
	}

	public void stampa(String nomeFile) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(nomeFile));
		for(int i=0; i<dim; i++)
			out.println(v[i]);
		out.close();
	}

	public static void main(String[] args) throws IOException {
		/*if(args.length < 2){
System.out.println("err");
System.exit(-1);
}*/
		VettoreInt myData = new VettoreInt();
		myData.leggi("C:\\Users\\vince\\OneDrive\\Desktop\\Read1.txt");
		myData.stampa("C:\\Users\\vince\\OneDrive\\Desktop\\Write1.txt");
	}
}