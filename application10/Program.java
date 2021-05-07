package application10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> candidates = new HashMap<>();
			
			String line = bf.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				
				if(!candidates.containsKey(fields[0])) {
					candidates.put(fields[0], Integer.parseInt(fields[1]));
				} else {
					candidates.put(fields[0], Integer.parseInt(fields[1]) + candidates.get(fields[0]));
				}
				
				
				line = bf.readLine();
			}
			
			for(String key : candidates.keySet()) {
				System.out.println(key + ": " + candidates.get(key));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		sc.close();
	}

}
