package application08;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Adrian");
		cookies.put("email", "adrian@gmail.com");
		cookies.put("phone", "9987654321");
		
		cookies.remove("email");
		
		cookies.put("phone", "1234567899");
		
		System.out.println("Contais 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println();
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}
	}

}
