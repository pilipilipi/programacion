package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int a, b, c;
		
		System.out.println("Dime tres numeros");
		
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		c= Integer.parseInt(sc.nextLine());
		
		if (a > b && a > c) {
			System.out.println("El mayor es el primero");
			
		} else if (b > a && b > c) {
			System.out.println("El mayor es el segundo");
			
		} else if (c > a && c > b) {
			System.out.println("El mayor es el tercero");
			
		} else 
			System.out.println("hay algún número igual"); 
			
		
		sc.close();
	}

}
