package metodos.ejemplos;

import java.util.Scanner;

public class Ejemplos01_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, mayor, mayor2;
		
		
		System.out.println("Dime el primer numero:");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el segundo numero:");
		b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el tercer numero:");
		c = Integer.parseInt(sc.nextLine());
		
		mayor = mayor(a, b);
		mayor2 = mayor(mayor, c);
		
		System.out.println("El mayor es: " + mayor(mayor, mayor2));
		
		sc.close();
	}
	
	
	public static int mayor (int x, int y) {
		if (x > y) {
			return x;
			
		} else {
			return y;
		}
	}

}
