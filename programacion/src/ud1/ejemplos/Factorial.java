package ud1.ejemplos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n;
		
		System.out.println("Dime un número parea calcular el factorial");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.print(n + "! = " + n + " * ");
		
		while (n < 0) {
			System.out.println("Que sea positivo");
			n = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = n-1; i >= 1; i--) {
			if (i > 1) {
				System.out.print(i + " * ");
				
			} else {
				System.out.print(i);
			}
		n *= i;
		}
		
		System.out.println(" = " + n);
		
		sc.close();
	}

}
