package practica2;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char tablero_relleno[][] = new char[10][10];
		char tablero_jugador[][] = new char[10][10];
		
		crear_tablero(tablero_relleno);
		
		sc.close();
	}

	public static void crear_tablero(char[][] tablero){
		
		String filas = "ABCDEFGHIJ";
		
		for(int i = 0; i < tablero.length; i++) {			
			System.out.print(filas.charAt(i) + " ");
			
			for(int j = 0; j < tablero[i].length; j++) {
				
				tablero[i][j] = '-';
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
