package ud1.ejemplos;

import java.util.Scanner;

public class BrechaSalarial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("dime el numero de personas");
		n = Integer.parseInt(sc.nextLine());
		
		int[][] matriz = new int[n][2];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Es hombre o mujer? ");
			}
		}
		
		sc.close();
	}

}
