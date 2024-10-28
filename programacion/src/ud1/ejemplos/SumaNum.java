package ud1.ejemplos;

import java.util.Scanner;

public class SumaNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, suma = 0;
		
		System.out.println("Dime un número para calcular la suma de todos los números hasta el");
		n = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + " + ");
				
			} else
				System.out.print(i);

			suma += i;
		}
		
		System.out.print(" = " + suma);
		
		sc.close();
	}

}
