package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int edad, personas, menor = 0, mayor = 0;
		
		System.out.println("Cuantas personas hay?");
		personas = Integer.parseInt(sc.nextLine());

		for (int i = 1; i<= personas; i++) {
			System.out.println("Dime una edad");
			edad = Integer.parseInt(sc.nextLine());
			
			if (edad < 18) {
				menor++;
				
			} else
				mayor++;
		}
		
		System.out.println("Hay " + menor + " personas menores de edad y " + mayor + " mayores.");
		
		sc.close();
	}

}
