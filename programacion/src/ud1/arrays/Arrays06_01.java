package ud1.arrays;

import java.util.Scanner;

public class Arrays06_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";		
		int n;		
		char[] array = cadena.toCharArray();

		
		do {
			System.out.println("Dime un número y se insertara la letra correspondiente del abecedario, 0 para terminar");			
			n = Integer.parseInt(sc.nextLine());
			
			System.out.println(array[n]);
			
			if (n >= array.length || n < 0) {
				System.out.println("Error");
			}
			
		} while (n > 0);
		
		System.out.println("Terminado");
				
		sc.close();
	}

}
