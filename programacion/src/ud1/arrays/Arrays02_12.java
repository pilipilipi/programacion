package ud1.arrays;

import java.util.Scanner;

public class Arrays02_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [10];
		String eleccion;
		int n, m;

		
		do {		
			System.out.println("Que quieres hacer (a, b, c): \n" 
					+ "a- mostrar valores. \n" 
					+ "b- introducir un valor. \n" 
					+ "c- salir.");
			
			eleccion = sc.nextLine();
			
			switch (eleccion) {
			
			case "a":
				for (int i = 0; i < array1.length; i++) {
					System.out.print(array1[i] + " ");
				}
				System.out.println("\n");
				
				break;
				
			case "b":
				System.out.println("Dime un valor:");
				n = Integer.parseInt(sc.nextLine());
				
				System.out.println("Y una posición de la 0 a la 9");
				m = Integer.parseInt(sc.nextLine());
				
				while (m < 0 || m > 9) {
					System.out.println("Has introducido una posicion no valida, pon otra \n");
					m = Integer.parseInt(sc.nextLine());
				}
				array1[m] = n;
				
				break;
				
			case "c":
				System.out.println("Terminado");
				
				break;
				
			default:
				System.out.println("Error \n");
			}
		} while (!eleccion.equals("c"));

		sc.close();
	}

}
