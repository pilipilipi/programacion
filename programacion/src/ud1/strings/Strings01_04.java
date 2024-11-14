package ud1.strings;

import java.util.Scanner;

public class Strings01_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		
		System.out.println("Dime una frase");
		cadena = sc.nextLine();
		cadena = cadena.toLowerCase();
		
		for (int j = 0; j < cadena.length(); j++) {
			if (cadena.charAt(j) == 'a') {
				a++;
				
			} else if (cadena.charAt(j) == 'e') {
				e++;
				
			} else if (cadena.charAt(j) == 'i') {
				i++;
				
			} else if (cadena.charAt(j) == 'o') {
				o++;
				
			} else if (cadena.charAt(j) == 'u') {
				u++;				
			}
		}
		
		
		System.out.println("a: " + a + ", e: " + e + ", i: " + i + ", o: " + o + ", u: " + u);
		sc.close();
	}

}
