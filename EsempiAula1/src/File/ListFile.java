package File;

import java.io.File;
public class ListFile {
	public static void main(String[] args) {
		File workingDir = new File("C:\\Users\\vince\\OneDrive\\Desktop");
		String[] lista = workingDir.list();
		File[] listaFile = workingDir.listFiles();
		for(int i=0; i<lista.length; i++) {
			System.out.println(lista[i]);
			System.out.println(listaFile[i].getName());
		}
	}
}