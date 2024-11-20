package ud1.arrays;

import java.util.Scanner;

public class Arrays07_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.println("Dime la longitud del array:");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime la longitud del array:");
		m = Integer.parseInt(sc.nextLine());
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = m;
			System.out.print(array[i] + " ");
		}
		
		sc.close();
	}

}
