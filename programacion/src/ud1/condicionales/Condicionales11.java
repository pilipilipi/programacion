package ud1.condicionales;

import java.util.Scanner;

public class Condicionales11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double t, precio = 0;
		String dia, turno = "";
		
		System.out.println("Cuantos minutos ha durado la llamada?");
		t = Double.parseDouble(sc.nextLine());
		
		System.out.println("Que día de la semana es?");
		dia = sc.nextLine();
		dia = dia.toLowerCase();
		
		if (!dia.equals("domingo")) {
			do {
				System.out.println("Y es turno de mañana o de tarde?");
				turno = sc.nextLine();
				turno = turno.toLowerCase();
			} while (!turno.equals("mañana") && !turno.equals("de mañana") && !turno.equals("tarde") && !turno.equals("de tarde"));
		
		}
		
		
		
		if (t <= 5) {
			precio = t;	
			
		} else if (t <= 8) {
				precio = 5 + (3 * 0.80);
				
		} else if (t <= 10) {
				precio = 5 + (3 * 0.80) + (2 * 0.70);
				
		} else {
				precio += (5 + (3 * 0.80) + (2 * 0.70) + (t - 10) * 0.50);
		}		
		
		if (dia.equals("domingo")) {
			precio += (precio * 0.03);
			
			System.out.println("El coste de la llamada es: " + (precio = Math.round(precio * 100.0) / 100.0));
			
		} else if (turno.equals("mañana") || turno.equals("de mañana")) {
			precio += (precio * 0.15);
			
			System.out.println("El coste de la llamada es: " + (precio = Math.round(precio * 100.0) / 100.0));
			
		} else {
			precio += (precio * 0.10);
			
			System.out.println("El coste de la llamada es: " + (precio = Math.round(precio * 100.0) / 100.0));
				
		}
		sc.close();
	}

}
