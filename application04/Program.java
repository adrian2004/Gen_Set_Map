package application04;

import entities04.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Adrian", "adrian@hotmail.com");
		Client c2 = new Client("Gabriel", "gabriel@gmail.com");
		
		System.out.println("Object Client and equals");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println("\nString and ==");
		System.out.println(s1 == s2);
		
		String s3 = new String("Test");
		String s4 = new String("Test");

		System.out.println("\nObject String and ==");
		System.out.println(s3 == s4);
		
		
		
	}

}
