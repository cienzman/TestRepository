package Collections;
import java.util.*;
public class ForVsEach {
	
	
	public static void main(String[] args)
	{
	ArrayList<String> countries = new ArrayList<>();
	countries.add("Italy");
	countries.add("United Kingdom");
	countries.add("USA");
	
	// for implementation
	for(int i = 0; i < countries.size(); i++) {
	String country = countries.get(i);
	System.out.println(country);
	}
	
	// for-each implementation
	for(String country : countries) {
	System.out.println(country);
	}

}
}