package ud1.ejemplos;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		sc.close();
	}

}
