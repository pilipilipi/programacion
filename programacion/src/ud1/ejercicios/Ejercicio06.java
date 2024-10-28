package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int num;
		
		System.out.println("Dime un número de dos cifras");
		num = Integer.parseInt(sc.nextLine());
		
		while (num < 10 || num >= 100) {
			System.out.println("El numero " + num + " no es de dos cifras, dime un número de dos cifras");
			num = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("El número tiene " + (num / 10) + " Centenas y " + (num % 10) + " unidades");
		
		sc.close();
	}

}
