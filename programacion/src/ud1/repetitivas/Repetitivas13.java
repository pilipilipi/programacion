package ud1.repetitivas;

import java.util.Scanner;

public class Repetitivas13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Dime un número ");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.print("1 ");
		
		for (int i = 2; i <= n; i++) {
			
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.print(", fizz");
				
			} else if (i % 5 == 0 && i % 3 != 0) {
				System.out.print(", buzz");
				
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(", fizzbuzz");
				
			} else {
				System.out.print(", "+ i);
			}
		}
		
		sc.close();
	}

}
