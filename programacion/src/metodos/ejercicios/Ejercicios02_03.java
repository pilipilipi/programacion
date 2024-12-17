package metodos.ejercicios;

import java.util.Scanner;

public class Ejercicios02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.println("Dime las filas");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime las columnas");
		m = Integer.parseInt(sc.nextLine());
		
		suma(m, n);
		sc.close();
	}
	
	
	public static int[][] relleno(int n, int m){
		int[][] matriz = new int[n][m];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 21);
			}
		}
		return matriz;
	}
	
	public static int[][] suma(int n, int m){
		int[][] matriz1 = relleno(n, m);
		int[][] matriz2 = relleno(n, m);
		int[][] matriz3 = new int[n][m];
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print(matriz3[i][j] + "\t");
			}
			System.out.println();
		}
		return matriz3;
	}
}
