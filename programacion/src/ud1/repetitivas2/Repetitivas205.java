package ud1.repetitivas2;

import java.util.Scanner;

public class Repetitivas205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n;
		
		System.out.println("Dime un número");
		n = Integer.parseInt(sc.nextLine());
		
		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}	
			
		} else {
			System.out.println("*");
		}
		
		sc.close();
	}

}
