package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int edad1, edad2;
		
		System.out.println("Dime la edad del primer hermano");
		edad1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime la del segundo");
		edad2 = Integer.parseInt(sc.nextLine());
		
		int dif = edad1 - edad2;
		
		if (dif < 0) {
			System.out.println("Es mayor el segundo y se sacan " + (dif * -1) + " años");
			
		} else if (dif > 0) {
			System.out.println("Es mayor el primero y se sacan " + dif + " años");
			
		} else 
			System.out.println("Tienen la misma edad");
		
		sc.close();
	}

}
