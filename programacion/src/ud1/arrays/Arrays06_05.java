package ud1.arrays;

import java.util.Scanner;

public class Arrays06_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, potencia = 1;
		String operacion;
		
		System.out.println("Dime el primer numero");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el segundo numero");
		m = Integer.parseInt(sc.nextLine());
		
		System.out.println("Que operascion quieres hacer (+, -, *, /, ^ o %)");
		operacion = sc.nextLine();
		
		switch (operacion) {
			case "+":
				System.out.println(n + " + " + m + " = " + (n+m));
				break;
			case "-":
				System.out.println(n + " - " + m + " = " + (n-m));
				break;
			case "*":
				System.out.println(n + " * " + m + " = " + (n*m));
				break;
			case "/":
				System.out.println(n + " / " + m + " = " + (n/m));
				break;
			case "^":
				for (int i = 1; i <= m; i++) {
					potencia *= n;
				}
				System.out.println(n + " ^ " + m + " = " + potencia);
				break;
			case "%":
				System.out.println(n + " % " + m + " = " + (n%m));
				break;
			
		}
		
		sc.close();
	}

}
