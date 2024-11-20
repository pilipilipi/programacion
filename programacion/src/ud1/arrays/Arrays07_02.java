package ud1.arrays;

import java.util.Scanner;

public class Arrays07_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[55];
		int acc = 0;
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				
				array[acc] = i;
				System.out.print(array[acc] + " ");
				
				acc++;
			}
		}
		
		sc.close();
	}

}
