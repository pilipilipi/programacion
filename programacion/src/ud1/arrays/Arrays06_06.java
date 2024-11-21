package ud1.arrays;

import java.util.Scanner;

public class Arrays06_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String intento, contraseña = "abcABC";
		int acc = 3;
		
		System.out.println("Introduce la contraseña, tienes 3 intentos");
		intento = sc.nextLine();
		
		 while(!intento.equals(contraseña) && acc != 1){
			System.out.println("Error, introducela de nuevo");
			intento = sc.nextLine();
			
			acc--;			
		}
		
		if(intento.equals(contraseña)) {
			System.out.println("Contraseña correcta");
			
		} else {
			System.out.println("No te quedan intentos");
		}
		
		sc.close();
	}

}
