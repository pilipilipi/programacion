package ud1.ejemplos;

import java.util.Scanner;

public class CuadradoAsteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		String forma, relleno;

		System.out.println("Que forma quieres que tenga la figura? (cuadrado, triangulo o rombo)");
		forma = sc.nextLine();
		forma.equalsIgnoreCase(forma);

		System.out.println("Dime el numero de filas que quieras que tenga:");
		n = Integer.parseInt(sc.nextLine());

		System.out.println("Quieres que esté relleno?");
		relleno = sc.nextLine();

		switch (forma) {

		case "cuadrado":

			if (relleno.equalsIgnoreCase("si")) {

				for (int i = 1; i <= n; i++) {

					for (int j = 1; j <= n; j++) {
						System.out.print("* ");
					}

					System.out.println();
				}

			} else {

				for (int i = 1; i <= n; i++) {

					if (i == 1 || i == n) {

						for (int j = 1; j <= n; j++) {
							System.out.print("* ");
						}

						System.out.println();

					} else {

						System.out.print("*");

						for (int j = 2; j < n; j++) {
							System.out.print("  ");
						}

						System.out.print(" *");
						System.out.println();
					}
				}
			}
			break;

		case "triangulo":

			if (relleno.equalsIgnoreCase("si")) {

				for (int i = 1; i <= n; i++) {

					for (int j = 1; j <= (n - i); j++) {
						System.out.print(" ");
					}

					for (int k = 1; k <= (i * 2 - 1); k++) {
						System.out.print("*");
					}

					System.out.println();
				}
			} else {

				for (int i = 1; i <= n; i++) {

					if (i == 1 || i == n) {

						for (int j = 1; j <= (n - i); j++) {
							System.out.print(" ");
						}

						for (int k = 1; k <= (i * 2 - 1); k++) {
							System.out.print("*");
						}

						System.out.println();

					} else {

						for (int j = 1; j <= (n - i); j++) {
							System.out.print(" ");
						}

						System.out.print("*");
						
						for (int k =2; k < (i * 2 - 1); k++) {
							System.out.print(" ");
						}
						
						System.out.print("*");
						System.out.println();

					}
				}
			}
			break;
			
		case "rombo":
			
			if (relleno.equalsIgnoreCase("si")) {
				
				for (int i = 1; i <= (n / 2); i ++) {
					
					for (int j = 1; j <= (n - i); j++) {						
						System.out.print(" ");
					}
					
					for (int k = 1; k <= (i * 2 - 1); k++) {						
						System.out.print("*");
					}
					
					System.out.println();
				}
				
				for (int i = (n / 2 + 1); i >= 1; i--) {

					for (int j = (n - i); j >= 1; j--) {						
						System.out.print(" ");
					}
					
					for (int k =  (i * 2 - 1); k >= 1; k--) {						
						System.out.print("*");
					}
					
					System.out.println();
				}
			} else {
				
				for (int i = 1; i <= (n / 2); i ++) {
										
					for (int j = 1; j <= (n - i); j++) {						
							System.out.print(" ");
					}
						
					if (i == 1) {
						
						for (int k = 1; k <= (i * 2 - 1); k++) {						
							System.out.print("*");
						}
						
						System.out.println();
						
					} else {

						System.out.print("*");
						
						for (int k =2; k < (i * 2 - 1); k++) {
							System.out.print(" ");
						}
						
						System.out.print("*");
						System.out.println();
					}
					
				}
				
				for (int i = (n / 2 + 1); i >= 1; i--) {
					
					
					for (int j = (n - i); j >= 1; j--) {						
							System.out.print(" ");
					}
						
					if (i == 1) {
							
						for (int k =  (i * 2 - 1); k >= 1; k--) {						
							System.out.print("*");
						}
						
						System.out.println();
						
					} else {
						
						System.out.print("*");
						
						for (int k =  (i * 2 - 2); k > 1; k--) {						
							System.out.print(" ");
						}
						
						System.out.print("*");
						System.out.println();
					}
				}				
			}
			break;
		}

		sc.close();
	}

}
