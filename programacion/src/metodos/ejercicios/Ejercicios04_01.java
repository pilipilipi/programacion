package metodos.ejercicios;

import java.util.Scanner;

public class Ejercicios04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Cuantas entradas desea introducir:");
		n = Integer.parseInt(sc.nextLine());
		
		mostrar(n);
		
		sc.close();
	}
	
	public static void mostrar(int n) {
		
		int relleno;
		
		for(int i = 1; i <= n; i++) {
			relleno = (int) (Math.random() * 2000) + 1;
			System.out.println(relleno + " " + codigo(relleno));
		}
	}
	
	public static int[] separar(int relleno) {
		int acc = 0, n = relleno;
		
		do {
			n /= 10;
			acc++;
		} while(n != 0);
		
		int[] digitos = new int[acc];
		
		for(int i = 0; i < digitos.length; i++) {	
			digitos[i] = relleno % 10;
			relleno /= 10;
		}
		
		return digitos;
	}
	
	public static int codigo(int relleno) {
		int[] digitos = separar(relleno);
		int cod = 0;
		
		for(int i = 0; i < digitos.length; i++) {
			
			if(i % 2 == 0) {
				cod += (digitos[i] * 3 + min_dcha(digitos, i));
				
			} else {
				cod += (digitos[i] * 2 + max_izq(digitos, i));
			}
		}
		
		return cod;
	}
	
	public static int min_dcha(int[] digitos, int index) {
		int menor;
		
		if(index == digitos.length - 1) {
			menor = 0;
			
		} else {
			menor = digitos[index + 1];
			
			for(int i = index + 1; i < digitos.length; i++) {
				
				if(digitos[i] < menor) {
					menor = digitos[i];
				}
			}
		}	
		return menor;
	}
	
	public static int max_izq(int[] digitos, int index) {
		int mayor;
		
		if(index == 0) {
			mayor = 0;
			
		} else {
			mayor = digitos[index - 1];
			
			for(int i = index - 1; i >= 0; i--) {
				
				if(digitos[i] > mayor) {
					mayor = digitos[i];
				}
			}
		}	
		return mayor;
	}
}




























