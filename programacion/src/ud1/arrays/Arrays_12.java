package ud1.arrays;

import java.util.Scanner;

public class Arrays_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [10];
		String eleccion;

		
		do {		
			System.out.println("Que quieres hacer (a, b, c): \n" 
					+ "a- mostrar valores. \n" 
					+ "b- introducirlos. \n" 
					+ "c- salir.");
			
			eleccion = sc.nextLine();
			
			switch (eleccion) {
			
			case "a":
				for (int i = 0; i < array1.length; i++) {
					System.out.print(array1[i] + " ");
				}
				System.out.println();
				break;
				
			case "b":
				for (int i = 0; i < array1.length; i++) {
					array1[i] = Integer.parseInt(sc.nextLine());
				}
				break;
				
			case "c":
				System.out.println("Terminado");
				
				break;
				
			default:
				System.out.println("Error");
			}
		} while (!eleccion.equals("c"));

		sc.close();
	}

}
