package ud1.ejemplos;

import java.util.Scanner;

public class Repeticion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int num;

		
		do {
				
			System.out.println("Dime un numero del 1 al 20");
			num = Integer.parseInt(sc.nextLine());
			
		} while (num > 20 || num < 1);
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
