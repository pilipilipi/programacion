package metodos.ejercicios;

import java.util.Scanner;

public class Ejercicios03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mes, anyo;
		
		do {
			
			System.out.println("Dime el mes 0 para terminar");
			mes = Integer.parseInt(sc.nextLine());
			
			System.out.println("Dime el anyo 0 para terminar");
			anyo = Integer.parseInt(sc.nextLine());
			
			System.out.println("El mes tiene " + dias_mes(mes, anyo) + " dias.");
			
		} while(anyo != 0 || mes != 0);
		
		sc.close();
	}
	
	
	
	public static int dias_mes(int mes, int anyo) {
		int dias;
		
		switch (mes) {
		
		case 1, 3, 5, 7, 8, 10, 12:
			dias = 31;
			break;
				
		case 4, 6, 9, 11:
			dias = 30;
			break;
			
		case 2:
			if(Ejercicios03_01.bisiesto(anyo) == true) {
				dias = 29;
					
			} else {
				dias = 28;
			}
				
			break;
				
		default:
			System.out.println("Mes no valido");
			dias = 0;
			break;
		}			
		return dias;
	}

}
