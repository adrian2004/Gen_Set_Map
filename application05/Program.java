package application05;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Cd");
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for(String p : set) {
			System.out.println(p);
		}
	}

}
