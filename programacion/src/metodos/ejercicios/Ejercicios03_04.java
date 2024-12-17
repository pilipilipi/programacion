package metodos.ejercicios;

import java.util.Scanner;

public class Ejercicios03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Dime un numero");
		n = Integer.parseInt(sc.nextLine());

		System.out.println("El siguiente numero primo es: " + primo(n));
		
		sc.close();
	}

	public static int primo(int n) {
		boolean esPrimo;
		
		do {
			n++;
			esPrimo = true;
			
			for(int i = 2; i <= Math.sqrt(n); i++) {
				
				if(n % i == 0) {
					esPrimo = false;
					break;
				}
			}
		} while (esPrimo == false);
		
		return n;
	}

}
