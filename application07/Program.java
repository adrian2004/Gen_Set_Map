package application07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		int id = 0;
		
		System.out.print("How many students for course A? ");
		int cA = sc.nextInt();
		
		for(int i = 0; i < cA; i++) {
			id = sc.nextInt();
			a.add(id);
		}
		
		System.out.print("How many students for course B? ");
		int cB = sc.nextInt();
		
		for(int i = 0; i < cB; i++) {
			id = sc.nextInt();
			b.add(id);
		}
		
		System.out.print("How many students for course C? ");
		int cC = sc.nextInt();
		
		for(int i = 0; i < cC; i++) {
			id = sc.nextInt();
			c.add(id);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
}