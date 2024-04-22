package Collections;
import java.util.ArrayList;

public class Generics1 {
	
public static void main(String[] args) {
	
ArrayList a = new ArrayList();
a.add(new Integer(10));
Integer b = (Integer) (a.get(0));
a.add(new Double(10));
b = (Integer) (a.get(1));
}
}