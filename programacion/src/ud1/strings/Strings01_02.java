package ud1.strings;

import java.util.Scanner;

public class Strings01_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a, b;
		
		System.out.println("Dime una palabra:");
		a = sc.nextLine();
		
		System.out.println("Dime otra:");
		b = sc.nextLine();
		
		if (a.equalsIgnoreCase(b)) {
			if (a.equals(b)){
				System.out.println("Son totalmetnte iguales");
				
			} else {
				System.out.println("Son igualse pero con diferencias entrE mayusculas y minusculas");
			}
				
		} else {
			System.out.println("No son iguales");
		}
		
		sc.close();
	}

}
