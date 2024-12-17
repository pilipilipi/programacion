package ud1.strings;

import java.util.Scanner;

public class Strings02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String cadena;
		int n;
		
		System.out.println("Dime una frase");
		cadena = sc.nextLine();
		
		String[] array = cadena.split(" ");
		
		n = (int) (Math.random() * array.length);
		
		for (int i = 0; i < array.length; i++) {
			if (i == n) {
				System.out.print("*" + array[i] + "* ");
				
			} else {
				System.out.print(array[i] + " ");
			}
		}
		
		sc.close();
	}

}
