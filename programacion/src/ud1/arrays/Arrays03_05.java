package ud1.arrays;

import java.util.Scanner;

public class Arrays03_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, p, q;
		
		System.out.println("Dime 4 numeros del 1 al 10, el primero y ultimo deben ser iguales");
		
		n = Integer.parseInt(sc.nextLine());
		m = Integer.parseInt(sc.nextLine());
		p = Integer.parseInt(sc.nextLine());
		q = Integer.parseInt(sc.nextLine());	
		
		while (n > 10 || n <= 0 || m > 10 || m <= 0 || p > 10 || p <= 0 || q > 10 || q <= 0 || n != q) {
			System.out.println("Error, introducelos de nuevo, del 1 al 10 y el primero y ultimo iguales:");
			
			n = Integer.parseInt(sc.nextLine());
			m = Integer.parseInt(sc.nextLine());
			p = Integer.parseInt(sc.nextLine());
			q = Integer.parseInt(sc.nextLine());
		}
		
		int[][] matriz = new int[n][m];
		int[][] matriz2 = new int[p][q];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10) + 1;
				
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < matriz2.length; i++) {
			
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = (int) (Math.random() * 10) + 1;
				
				System.out.print(matriz2[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		//multiplicacion
		
		
		sc.close();
	}

}
