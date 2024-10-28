package ud1.ejemplos;

import java.util.Scanner;

public class InvertirNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n, inv = 0, dig;
		
		System.out.println("Dime un nuúmero para invertirlo");
		n = Integer.parseInt(sc.nextLine());
		
		while (n != 0) {
			
			dig = n % 10;
			
			inv = inv * 10 + dig;
			
			n /= 10;
		}
		
		System.out.println("El número invertido es: " + inv);
		
		sc.close();
	}

}
