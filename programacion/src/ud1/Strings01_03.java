package ud1;

import java.util.Scanner;

public class Strings01_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre, apellido, apellido2, resultado = "";
		
		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		
		System.out.println("Dime tu apellido");
		apellido = sc.nextLine();
		
		System.out.println("Dime tu seguundo apellido");
		apellido2 = sc.nextLine();
		
		resultado += nombre.substring(0, 3);
		resultado += apellido.substring(0, 3);
		resultado += apellido2.substring(0, 3);
		
		System.out.println(resultado.toUpperCase());
		
		sc.close();
	}

}
