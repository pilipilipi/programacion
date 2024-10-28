package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int trabajadores;
		int sueldo, sueldoTot = 0;
		
		System.out.println("Dime cuantos trabajadores tienes");
		trabajadores = Integer.parseInt(sc.nextLine());
		
//		do {
//			System.out.println("Dime un sueldo");
//			sueldo = Integer.parseInt(sc.nextLine());
//			sueldoTot += sueldo;
//			
//			trabajadores++;			
//		} while (trabajadores < trabajadores);
		
		for (int i = 1; i <= trabajadores; i++) {
			if (i == 1) {
				System.out.println("Dime los sueldos de los trabajadores");
				sueldo = Integer.parseInt(sc.nextLine());
				
			} else {
				System.out.println("Dime otro sueldo");
				sueldo = Integer.parseInt(sc.nextLine());
			}

			sueldoTot += sueldo;
		}
		
		System.out.println("El salario medio es " + (sueldoTot / trabajadores));
		
		sc.close();
	}

}
