package ud1.ejercicios;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double nota, suma = 0;
		int acc = 0, acc2 = 1;
		
		do {
			System.out.println("Dime la " + acc2++ + " nota del alumno (0 para parar)");
			nota = Double.parseDouble(sc.nextLine());
			suma += nota;
			acc++;
			
			if (nota == 0) {
				acc--;
			}
	
		} while (nota != 0 );
	
		System.out.println("La media del alumno es " + (suma) / (acc));
		
		sc.close();
	}
	

}
