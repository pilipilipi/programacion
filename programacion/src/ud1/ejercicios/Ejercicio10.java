package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String vocales = "aeiou";
		char letra;
		
		do {
			System.out.println("Dime una letra");
			letra = sc.next().charAt(0);
			
			letra = Character.toLowerCase(letra);
			
		} while (vocales.indexOf(letra) == -1);
		
		System.out.println("Has introducido una vocal");
		
		sc.close();
	}

}
