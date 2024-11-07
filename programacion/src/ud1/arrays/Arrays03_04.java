package ud1.arrays;

import java.util.Scanner;

public class Arrays03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = (int) (Math.random() * 3) + 3;
		
		int[][] matriz = new int [n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 50) + 1;
				
				System.out.print(matriz[i][j] + "\t");				
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[(n - 1) - j][i] + "\t");			
			}
			System.out.println();
		}
		
		sc.close();
	}

}
