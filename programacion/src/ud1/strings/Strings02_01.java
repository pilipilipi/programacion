package ud1.strings;

import java.util.Scanner;

public class Strings02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String correos;
		
		System.out.println("Dime la lista de correos separados por comas");
		correos = sc.nextLine();
		
		String[] array = correos.split(",\\s?");
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i].contains("@") && (array[i].contains(".com" ) || array[i].contains(".org") || array[i].contains(".es"))) {
				System.out.print(array[i] + " ");
			}
		}
		
		sc.close();
	}

}
