package ud1.ejemplos;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, sum = 1;
		
		System.out.println("Dime un número");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.print("La suma de sus divisores es: 1");
		
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum += i;
				
				System.out.print(" + " + i);
			}
		}
		
		if (sum == n) {
			System.out.println(" = " + sum + " Es un número perfecto");
			
		} else
			System.out.println(" = " + sum + " No es perfecto");
		
		
		sc.close();
	}

}
