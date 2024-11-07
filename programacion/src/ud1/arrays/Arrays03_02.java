package ud1.arrays;

import java.util.Scanner;

public class Arrays03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = (int) (Math.random() * 8) + 3;
		
		int[] array1 = new int [n];
		int[] array2 = new int [n];
		int[] array3 = new int [n];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 50) + 1;
			
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * 50) + 1;
			
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (array1[i] + array2[i]);
			
			System.out.print(array3[i] + " ");
		}
		
		sc.close();
	}

}
