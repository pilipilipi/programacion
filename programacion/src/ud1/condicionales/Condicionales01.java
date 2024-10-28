package ud1.condicionales;

import java.util.Scanner;

public class Condicionales01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int lado;
		
		System.out.println("Dime cuanto mide el ");
		lado = Integer.parseInt(sc.nextLine());
		
		System.out.println("El área es: " + (lado * lado) + " y el périmetro es : " + (lado * 4));
		
		sc.close();
	}

}
