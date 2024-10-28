package ud1.condicionales;

import java.util.Scanner;

public class Condicionales04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double p1, p2, porcentaje;
		
		System.out.println("Dime el precio original");
		p1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el precio rebajado");
		p2 = Integer.parseInt(sc.nextLine());
		
		porcentaje = (p1 - p2) / p1 * 100;
		
		System.out.println("El descuento es del " + porcentaje + "%");
				
		sc.close();
	}

}
