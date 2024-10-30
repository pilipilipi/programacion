package ud1.arrays;

import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [10];
		int[] array2 = new int [20];
		int[] array3 = new int [30];
		
		//ej1
		
		for (int i = 0; i < array1.length; i++) {	
			//ej6
			
			if (i > 1 && i < 8) {
				if (i < 6) {	
					array1[i] = array2.length - i + 2;
				
				} else {
					array1[i] = 99;	
				}
			} else {
				array1[i] = 100 + i;
			}
			
			System.out.print(array1[i] + " ");
		}
		System.out.println("\n");
		
		//ej2
		
		for (int i = 0; i < array2.length; i++) {				
			//ej5
			
			if (i >= 4 && i < 8) {
				array2[i] = 99;	
			
			} else {
				array2[i] = array2.length - i;
			}

			System.out.print(array2[i] + " ");		
		}
		System.out.println("\n");
		
		//ej3
		
		for (int i = 0; i < array2.length; i++) {
			array3[i] = array2.length -i;
			
			System.out.print(array3[i] + " ");
		}
		
		for (int i = array2.length; i < array3.length; i++) {
			array3[i] = 100 + i - array2.length;
			
			System.out.print(array3[i] + " ");
		} 
		System.out.println("\n");
		
		//ej4
		
		System.out.println(array3[array2.length - 5] + "\n");
		
		sc.close();
	}

}
