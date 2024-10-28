package ud1.repetitivas2;

import java.util.Scanner;

public class Repetitivas201 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n;
		 
		System.out.println("Dime un número para calcular los múltiplos de 3");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Los múltiplos de 3 son: ");
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}
