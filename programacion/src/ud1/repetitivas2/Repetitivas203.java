package ud1.repetitivas2;

import java.util.Scanner;

public class Repetitivas203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n, m, l, acc = 0, acc2 = 0;
		
		System.out.println("Dime un número");
		n = Integer.parseInt(sc.nextLine());
		
		do {		
			System.out.println("Dime un número mayor, 0 para terminar");
			m = Integer.parseInt(sc.nextLine());
			
			l = n;
			n = m;
			
			if (m < l && m != 0) {
				System.out.println("Error, es menor");
				acc2++;
			
			} else if (m == l) {
				System.out.print("Son iguales. ");
				acc2++;
			}
			
			acc++;
			
		} while (m != 0);
		
		System.out.println("FIn, ha introducido " + acc + " números, y ha fallado " + acc2 + " veces");
		
		sc.close();
	}

}
