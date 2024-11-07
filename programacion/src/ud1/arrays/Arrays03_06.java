package ud1.arrays;

import java.util.Scanner;

public class Arrays03_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = (int) (Math.random() * 3) + 4;		
		
		int[][] matriz = new int [n][n];
		int max = 0, min = 0, x = 0, y = 0, x2 = 0, y2 = 0;
		
		System.out.println("Temperaturas extremas:");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 101) - 50;
				
//				System.out.print(matriz[i][j] + " ");
				
				if (matriz[i][j] > 40 || matriz[i][j] < -25) { 
					System.out.println("Posicion (" + i + ", " + j + "): " + matriz[i][j] + "º");
				}				
				
				if (matriz[i][j] > max) {
					max = matriz[i][j];
					x = i;
					y = j;
					
				} else if (matriz[i][j] < min) {
					min = matriz[i][j];
					x2 = i;
					y2 = j;
				}
			}
		}
		
		System.out.println("La temperatura mas alta es (" + x + ", " + y + "): " + max + "º y la mas baja (" + x2 + ", " + y2 + "): "+ min + "º");
		
		sc.close();
	}

}
