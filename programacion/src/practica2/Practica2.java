package practica2;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intentos = 50;
		char tablero_relleno[][] = new char[10][10];
		char tablero_jugador[][] = new char[10][10];
		
		crear_tablero(tablero_jugador);
		crear_tablero(tablero_relleno);
		
		insertarBarco(tablero_relleno, 'L', 1, 5);
        insertarBarco(tablero_relleno, 'B', 3, 3);
        insertarBarco(tablero_relleno, 'Z', 4, 1);
        insertarBarco(tablero_relleno, 'P', 5, 1);
		
        jugar(tablero_relleno, tablero_jugador, intentos);
        
		sc.close();
	}

	public static void mostrar_tablero(char[][] tablero){		
		String filas = "ABCDEFGHIJ";
		
		System.out.println("  0 1 2 3 4 5 6 7 8 9");
		
		for(int i = 0; i < tablero.length; i++) {			
			System.out.print(filas.charAt(i) + " ");
			
			for(int j = 0; j < tablero[i].length; j++) {
				
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void crear_tablero(char[][] tablero){		
		
		for(int i = 0; i < tablero.length; i++) {						
			for(int j = 0; j < tablero[i].length; j++) {
				
				tablero[i][j] = '-';
			}
		}
	}
	
    public static void insertarBarco(char[][] tablero, char tipo, int tamano, int cantidad) {
        int barcos_colocados = 0;
        while (barcos_colocados < cantidad) {
            int fila = (int) (Math.random() * tablero.length);
            int columna = (int) (Math.random() * tablero[0].length);
            boolean es_horizontal = Math.random() < 0.5;

            if (esPosicionValida(tablero, fila, columna, tamano, es_horizontal)) {
                for (int i = 0; i < tamano; i++) {
                    if (es_horizontal) {
                        tablero[fila][columna + i] = tipo;
                    } else {
                        tablero[fila + i][columna] = tipo;
                    }
                }
                barcos_colocados++;
            }
        }
    }
    
    public static boolean esPosicionValida(char[][] tablero, int fila, int columna, int tamano, boolean es_horizontal) {
        if (es_horizontal) {
            if (columna + tamano > tablero[0].length) {
            	return false;
            }
            for (int i = 0; i < tamano; i++) {
                if (tablero[fila][columna + i] != '-') {
                	return false;
                }
            }
        } else {
            if (fila + tamano > tablero.length) {
            	return false;
            }
            for (int i = 0; i < tamano; i++) {
                if (tablero[fila + i][columna] != '-') {
                	return false;
                }
            }
        }
        return true;
    }
    
    public static void jugar(char[][] tablero_relleno, char[][] tablero_jugador, int intentos) {
    	Scanner sc = new Scanner(System.in);
    	
    	String filas = "ABCDEFGHIJ", filaChar;
    	int columna, fila;
    	    	
    	//int barcosRestantes = contarBarcos(tablero_relleno);
    	
    	while(intentos > 0) {
    		mostrar_tablero(tablero_jugador);
    		
    		System.out.println("Dime la fila (letra)");
    		filaChar = sc.nextLine().toUpperCase();
    		
    		while(!filas.contains(filaChar)) {
    			System.out.println("Fila no válida introduce una nueva");
    			filaChar = sc.nextLine().toUpperCase();
    		}
    		fila = filas.indexOf(filaChar);
    		
    		System.out.println("Dime la columna (numero)");
    		columna = Integer.parseInt(sc.nextLine());
    		
    		while(columna >= tablero_relleno[0].length || columna < 0) {
    			columna = Integer.parseInt(sc.nextLine());
    		}
    		
    		if (tablero_jugador[fila][columna] != '-') {
    			System.out.println("Ya has disparado en esa posición");

    		} else {
    			
    			if (tablero_relleno[fila][columna] == '-') {
        			System.out.println("Agua!!");
        			tablero_jugador[fila][columna] = 'A';
        			
        		} else {
        			System.out.println("barco tocado!!");
        			tablero_jugador[fila][columna] = 'x';
        			tablero_relleno[fila][columna] = '-';
        			
        		}
    		}
    	}
    	
    	
    	
    	sc.close();
    }
    
    public static int contar_barcos(char[][] tablero) {
        int barcos = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != '-') {
                    barcos++;
                }
            }
        }
        return barcos;
    }
}





























