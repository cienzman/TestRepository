package Collections;

import java.util.ArrayList;
public class Generics2 {
public static void main(String[] args) {
// TODO code application logic here
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(new Integer(10));
Integer b = a.get(0);
a.add(new Double(10));
b = a.get(1);
}
}


