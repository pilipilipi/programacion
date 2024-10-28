package ud1.repetitivas;

import java.util.Scanner;

public class Repetitivas09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota, acc = 0;
		
		System.out.println("Dime una nota, -1 para terminar:");
		nota = Integer.parseInt(sc.nextLine());
		
		while (nota != -1){
			if (nota < -1 || nota > 10) {
				System.out.println("Nota no válida debe ser de o a 10");
				
			} else if (nota == 10) {
				acc++;
			}
			
			System.out.println("Introduce otra nota, -1 para terminar:");
			nota = Integer.parseInt(sc.nextLine());
		}
		
		if (acc > 0) {
			System.out.println("Ha habido " + acc + " dieces");
			
		} else
			System.out.println("No ha habido ningún 10");
		
		sc.close();
	}

}
