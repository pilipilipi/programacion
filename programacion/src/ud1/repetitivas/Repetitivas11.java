package ud1.repetitivas;

import java.util.Scanner;

public class Repetitivas11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("DIme la base");
		a = Integer.parseInt(sc.nextLine());
		
		c = a;
		
		System.out.println("Dime el exponente");
		b = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i < b; i++) {
			c *= a;
		}
		
		System.out.println("la potencia de " + a + " elevado a " + b + " es = " + c);
		
		sc.close();
	}

}
