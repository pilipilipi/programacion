package metodos.ejemplos;

import java.util.Scanner;

public class Ejemplos01_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, anyo;
		
		System.out.println("Introduce el dia");
		dia = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el mes");
		mes = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el anyo");
		anyo = Integer.parseInt(sc.nextLine());
		
		if (fecha(dia, mes) == true) {
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo + " es correcta");
			
		} else {
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo + " es incorrecta");
		}
		
		
		sc.close();
	}

	
	public static boolean fecha(int dia, int mes) {
		boolean fecha = true;
		
		if (dia < 1 || dia > 30) {
			fecha = false;
					
		} else if (mes < 1 || mes > 12) {
			fecha = false;			
		} 
		
		return fecha;
	}
}
