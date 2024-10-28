package ud1.repetitivas2;

import java.util.Scanner;

public class Repetitivas204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		
		System.out.print("1^2");
		
		for (int i = 2; i <= 5; i++) {
			System.out.print(" + " + i + "^2");
			
			sum += (i * i);
		}
		
		System.out.println(" = " + sum);
		sc.close();
	}

}
