package metodos.ejemplos;

import java.util.Scanner;

public class ejemplos_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Dime el primer numero:");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el primer numero:");
		b = Integer.parseInt(sc.nextLine());
		
		System.out.println(multiplica(a, b));
		
		System.out.println("Dime tu edad");
		a = Integer.parseInt(sc.nextLine());
		
		if (edad(a) == true) {
			System.out.println("Es mayor de edad");
		
		} else {
			System.out.println("Es menor");
		}
		
		sc.close();
	}
	
	public static int multiplica(int a, int b) {
		int res;
		
		res = a * b;
		return(res);
	}
	
	public static boolean edad(int a) {
		boolean mayor = false;
		
		if(a >= 18) {
			mayor = true;
		}		
		return mayor;
	}

}
