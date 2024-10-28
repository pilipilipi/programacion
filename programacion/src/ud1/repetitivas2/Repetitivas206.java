package ud1.repetitivas2;

import java.util.Scanner;

public class Repetitivas206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Dime un número mayor que 0");
		n = Integer.parseInt(sc.nextLine());
		
		while (n <= 0) {
			System.out.println("Tiene que ser mayor que 0, dime otro");
			n = Integer.parseInt(sc.nextLine());
			
		}
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
