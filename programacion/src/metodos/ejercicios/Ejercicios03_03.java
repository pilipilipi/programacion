package metodos.ejercicios;

import java.util.Scanner;

public class Ejercicios03_03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Dime un numero");
		n = Integer.parseInt(sc.nextLine());
		
		if(capicua(n) == true) {
			System.out.println("El numero es capicua");
			
		} else {
			System.out.println("el numero no es capicua");
		}
		
		sc.close();
	}
	
	public static boolean capicua(int n) {
		int digito, invertido = 0, m = n;
		boolean es_capicua = false;
		
		do {
			digito = m % 10;
			invertido = invertido * 10 + digito;
			m /= 10;			
		} while(m != 0);
		
		if(n == invertido) {
			es_capicua = true;
			
		} else {
			es_capicua = false;
		}
		return es_capicua;
	}
	
}
