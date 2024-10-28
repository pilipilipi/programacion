package ud1.repetitivas2;

import java.util.Scanner;

public class Repetitivas202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n, acc = 0;
		
		System.out.println("Dime un número para comprobar si es primo");
		n = Integer.parseInt(sc.nextLine());
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				acc++;
			}
		}
		
		if (acc == 0) {
			System.out.println("Es primo");
			
		} else {
			System.out.print("No es primo y sus divisores son : 1");
			
			for (int j = 2; j <= n; j++) {
                if (n % j == 0) {
                    System.out.print(", " + j );
                }
			}
		}	
		
		sc.close();
	}
}
