package metodos.ejemplos;

import java.util.Scanner;

public class Ejemplos_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double precio;
		
		System.out.println("Dime el primer numero:");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el segundo numero:");
		b = Integer.parseInt(sc.nextLine());
		
		System.out.println("\nLa multiplicacion es: " + multiplica(a, b));		
		System.out.println("Y el minimo de los dos numeros es: " + minimo(a, b));
		
		
		System.out.println("\nDime tu edad");
		a = Integer.parseInt(sc.nextLine());
		
		if (edad(a) == true) {
			System.out.println("Es mayor de edad");
		
		} else {
			System.out.println("Es menor");
		}
		
		
		System.out.println("\nDime una distancia en millas:");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Son: " + millas_a_km(a) + " km");
		
		System.out.println("\nDime el precio del producto sin IVA:");
		precio = Double.parseDouble(sc.nextLine());
				
		System.out.println("Con el  iva añadido serían: " + precioIVA(precio));
		
		sc.close();
	}
	
	public static int multiplica(int a, int b) {
		int res;
		
		res = a * b;
		return(res);
	}
	
	public static boolean edad(int a) {
		boolean mayor = false;
		
		if (a >= 18) {
			mayor = true;
		}		
		return mayor;
	}
	
	public static int minimo(int a, int b) {
		int menor = 0;
		
		if (a < b) {
			menor = a;
			
		} else {
			menor = b;				
		} 	
		return menor;
	}
	
	public static double millas_a_km(int a) {
		double km;
		
		km = a * 1.60934;
		km = Math.round(km * 100.0) / 100.0;
		
		return km;
	}

	public static double precioIVA(double precio) {
		
		precio += (precio * 0.21);		
		precio = Math.round(precio * 100.0) / 100.0;
		
		return precio;
	}
	
	
}
