package ud1.repetitivas;

import java.util.Scanner;

public class Repetitivas10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, imp = 1, par = 0;
		
		System.out.println("Dime un número para calcular la suma de sus pares e impares:");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.print("La suma de los pares es: 0");

		for (int i = 2; i <= num; i += 2) {
			System.out.print(" + " + i);
			
			par += i;
		}
		
		System.out.println(" = " + par);
		
		
		System.out.print("La suma de los impares es: 1");	

		for (int j = 3; j <= num; j += 2) {
			System.out.print(" + " + j);
			
			imp += j;
		}
		
		System.out.println(" = " + imp);
		
		sc.close();
	}

}
