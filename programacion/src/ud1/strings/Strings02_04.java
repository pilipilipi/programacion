package ud1.strings;

import java.util.Scanner;

public class Strings02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String palabra, palabra2, a;
		
		System.out.println("Dime la primera palabra");		
		palabra = sc.nextLine().replace(" ", "");
		
		System.out.println("Dime la segunda palabra");		
		palabra2 = sc.nextLine().replace(" ", "");
		
		a = "";
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
            a += palabra.charAt(i);
		}
		
		if (palabra2.equalsIgnoreCase(a)) {
			System.out.println("Son palíndromos");
			
		} else {
			System.out.println("No lo son");
		}
		
		sc.close();
	}

}
