package ud1.strings;

import java.util.Scanner;

public class Strings02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String cadena;
		
		System.out.println("Dime una frase");
		cadena = sc.nextLine();
		
		String[] array = cadena.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			
			cadena = array[i];
			
			for (int j = cadena.length() - 1; j >= 0; j--) {
				System.out.print(cadena.charAt(j));
			}
			System.out.print(" ");
		}
		
		sc.close();
	}

}
