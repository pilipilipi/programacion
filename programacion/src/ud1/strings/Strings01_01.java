package ud1.strings;

import java.util.Scanner;

public class Strings01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String cadena;
		
		System.out.println("Dime una frase");
		cadena = sc.nextLine();
		
		String[] frase = cadena.split(" ");
		
		for(int i = 0; i < frase.length; i ++) {
			System.out.println(frase[i]);
			
		}
				
		sc.close();
	}

}
