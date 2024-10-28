package ud1.ejemplos;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n;
		
		System.out.println("Dime el número de filas que quieres en la columna");
		n = Integer.parseInt(sc.nextLine());

		for(int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= (n - i); j++) {
				//En este for usamos la variable j como guía del número de espacios hacemos el print sin ln 
				//para que se quede en la misma línea que el asterisco y n - i es el número de línea menos i que 
				//es el número de línea que estamos y la posición que ocupa cada asterisco nuevo
				System.out.print(" ");
			}
			
			for(int k = 1; k <= (2 * i - 1); k++) {
				//En este es mas o menos lo mismo, quitamos el ln para que no pase a la siguiente línea
				//y lo que hace es entrar i cada vez sumando dos repeticiones mas del bucle ya que es i++ * 2 
				//y el -1 para que sean impares y la punta solo sea un asterisco
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
