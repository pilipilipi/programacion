package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("los 20 primeros números pares son: 2");
		
		for (int i=3; i<=20; i++) {
			if (i % 2 == 0) {
				System.out.print(", " + i);
			}
		}
		
		sc.close();
	}

}
