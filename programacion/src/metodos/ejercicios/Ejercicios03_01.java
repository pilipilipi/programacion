package metodos.ejercicios;

import java.util.Scanner;

public class Ejercicios03_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anyo;
		
		do {
			System.out.println("Dime un anyo, 0 para terminar");
			anyo = Integer.parseInt(sc.nextLine());
			

			if(bisiesto(anyo) == true) {
				System.out.println("El año " + anyo + " es bisiesto. \n");
				
			} else {
				System.out.println("El año " + anyo + " no es bisiesto. \n");
			}
			
		} while(anyo != 0);
		
		sc.close();
	}
	
	
	public static boolean bisiesto(int anyo) {
		
		boolean esBisiesto = false;
		
		if(anyo % 4 == 0) {
			esBisiesto = true;
			
			if(anyo % 100 == 0 && anyo % 400 != 0) {
				esBisiesto = false;
			}
		}
		return esBisiesto;
	}
}
