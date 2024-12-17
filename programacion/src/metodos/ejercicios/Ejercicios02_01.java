package metodos.ejercicios;

import java.util.Scanner;

public class Ejercicios02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("Dime un numero para ver si es hyperpar");
			n = Integer.parseInt(sc.nextLine());
			
			if (descomponer(n) == false) {
				System.out.println("No es hyperpar");
				
			} else {
				System.out.println("Es hyperpar");
			}
			
		} while (n != 0);
		
		sc.close();
	}

//	public static int[] descomponer(int n) {
//		int m = n, acc = 0;
//		
//		do {
//			m /= 10;
//			acc++;			
//		} while (m != 0);
//				
//		int[] digitos = new int[acc];			
//		for (int i = 0; i < digitos.length; i++) {
//			digitos[i] = n % 10;
//			n /= 10;
//		}
//		
//		return digitos;
//	}
//	
//	public static boolean hyperpar(int n) {
//		boolean siEs = true;
//		int[] digitos = descomponer(n);
//		
//		for (int i = 0; i < digitos.length; i++) {
//			if (digitos[i] % 10 != 0) {
//				siEs = false;
//				break;
//			}
//		}
//		return siEs;
//	}
	
	public static Boolean descomponer(int n) {
		int resto;
		boolean siEs = true;
		
		do {
			resto = n % 10;
			n /= 10;
			
			if (hyperpar(resto) == false) {
				siEs = false;
				break;
			}			
		} while (n > 0);
		
		return siEs;
	}
	
	
	public static boolean hyperpar(int resto) {
		
	boolean par = true;
	
	if (resto % 2 != 0) {
		par = false;
	}
	
	return par;
	}
	
}
