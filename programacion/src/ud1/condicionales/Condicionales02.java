package ud1.condicionales;

import java.util.Scanner;

public class Condicionales02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double n, m;
		String operacion;
		
		System.out.println("Dime el primer número");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el segundo");
		m = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime que operación quieres hacer");
		operacion = sc.nextLine();
		
		switch (operacion.toLowerCase()) {
			
			case "sumar":
				System.out.println(n + " + " + m + " = " + (n + m));
				break;
				
			case "restar":
				System.out.println(n + " - " + m + " = " + (n - m));
				break;
				
			case "multiplicar":
				System.out.println(n + " * " + m + " = " + (n * m));
				break;
				
			case "dividir":
				System.out.println(n + " / " + m + " = " + (n / m));
				break;
		}
		
		sc.close();
	}

}
