package ud1.arrays;

import java.util.Scanner;

public class Arrays06_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int calc = 0;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int[] dni = new int[8];
		char[] letra = letras.toCharArray();
		
		for(int i  = 0; i < dni.length; i++) {
			
			System.out.println("Dime el " + (i+1) + " número de tu dni");
			dni[i] = Integer.parseInt(sc.nextLine());
			
			calc += dni[i];
		}
		
		calc = (calc / 23) + 1;
		
		
		System.out.print("\nTu DNI completo es: ");
		
		for (int i = 0; i < dni.length; i++) {
			System.out.print(dni[i]);
		}

		System.out.print(" " + letra[calc]);
		sc.close();
	}

}
