package ud1.arrays;

import java.util.Scanner;

public class Arrays02_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [55];
		int acc = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= i; j++) {
				array1[acc] = i;					
				System.out.print(array1[acc] + " ");
				
				acc++;
			}
		}
		
		sc.close();
	}

}
