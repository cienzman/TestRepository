package File;
import java.io.*;
import java.util.*;

public class LetturaToken {
	
	public static void main(String[] args) throws IOException {

	StringTokenizer st = new StringTokenizer("Token1 Token2 Token3 token4 token5 t6 t7 T8"); 
	/* Così prende lo spazio come separatore di default*/
	while(st.hasMoreTokens())
	System.out.println(st.nextToken());
	System.out.println("\n");
	
	StringTokenizer st2 = new StringTokenizer("Token1, Token2, Token3, token4, token5, t6, t7, T8",","); 
	/* Così prende la virgola come separatore*/
	while(st2.hasMoreTokens())
	System.out.println(st2.nextToken());
	System.out.println("\n");
	
	StringTokenizer st3 = new StringTokenizer("Token1p Token2 p Token3 p token4 p token5 p t6p t7 p T8","p"); 
	/* Così prende la lettera p come separatore*/
	while(st3.hasMoreTokens())
	System.out.println(st3.nextToken());
	}
}
	
