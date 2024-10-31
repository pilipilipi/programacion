package ud1.arrays;

import java.util.Scanner;

public class Arrays010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array1 = new int [10];
		int[] array2 = new int [20];
		int[] array3 = new int [30];
		
		//ej1
		
		for (int i = 0; i < array1.length; i++) {	
			array1[i] = 100 + i;
		}
	
		//ej2
		
		for (int i = 0; i < array2.length; i++) {						
			array2[i] = array2.length - i;
		}
		
		//ej5
		
		for (int i = 5; i <= 8; i++) {
			array2[i] = 99;		
		}
		
		//ej6
		
		for (int i = 2; i < 8; i++) {
			array1[i] = array2[i - 2];
		}
		
		//ej3
		
		for (int i = 0; i < array2.length; i++) {
			array3[i] = array2.length -i;
		}
		
		for (int i = array2.length; i < array3.length; i++) {
			array3[i] = 100 + i - array2.length;
		} 
		
		//ej4
		
		
		//ej7
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		} 
		
		System.out.println("\n");
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		} 
		
		System.out.println("\n");
		
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		} 
		
		sc.close();
	}

}
