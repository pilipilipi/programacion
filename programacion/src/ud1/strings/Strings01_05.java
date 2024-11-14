package ud1.strings;

import java.util.Scanner;

public class Strings01_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		boolean palindromo = true;
		
		System.out.println("Dime una frase para saber si es palindromo");
		cadena = sc.nextLine();
		
		cadena = cadena.replace(" ", "").toLowerCase();
		
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i) != cadena.charAt(cadena.length() - (i + 1))) {
				palindromo = false;	
				break;
			}			
		}
		
		if (palindromo == true) {
			System.out.println("Es un palindromo");
			
		} else {
			System.out.println("No es un palindromo");
		}
		
		sc.close();
	}

}
