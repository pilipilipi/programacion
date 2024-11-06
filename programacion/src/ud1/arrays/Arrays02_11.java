package ud1.arrays;

import java.util.Scanner;

public class Arrays02_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [100];
		int[] array2 = new int [100];
		
		System.out.println("Array 1: ");
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
			System.out.print(array1[i] + " ");
		}
		
		System.out.println("\n\nArray 2: ");
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[99 - i];
			System.out.print(array2[i] + " ");
		}
		
		sc.close();
	}

}
