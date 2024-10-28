package ud1.repetitivas;

import java.util.Scanner;

public class Repetitivas12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, aleatorio = 0, acc = 1;
		int max = 100, min = 0;
		
		System.out.println("Dime un número del 0 al 100 para que el ordenador lo adivine");
		num = Integer.parseInt(sc.nextLine());
		
		while (num < 0 || num > 100) {
			System.out.println("Número fuera de rango, introduce uno nuevo:");
			num = Integer.parseInt(sc.nextLine());
		}
		
		do {
			System.out.println();
			System.out.println("Pulsa enter para generar nuevo número");
			sc.nextLine();
			
			aleatorio = (int) (Math.random() * (max - min) + min);
			System.out.println(aleatorio);
			
			if (aleatorio > num) {
				System.out.println("Mal! mas abajo");
				max = aleatorio - 1;
				
			} else  if (aleatorio < num){
				System.out.println("Noo, mas arriba");
				min = aleatorio + 1;	
			}
			
			acc ++;
			
		} while (aleatorio != num);
		
		System.out.println("Correcto! el número era " + num + " ha utilizado " + acc + " intentos");		
		
		sc.close();
	}

}
