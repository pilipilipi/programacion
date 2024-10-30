package ud1.arrays;

import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [10];
		int acc = 100;
		
		for (int i = 0; i < array1.length; i++) {
			
			array1[i] = acc;
			acc++;
			
			System.out.print(array1[i] + " ");
		}
		
		sc.close();
	}

}
