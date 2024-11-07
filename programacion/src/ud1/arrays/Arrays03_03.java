package ud1.arrays;

import java.util.Scanner;

public class Arrays03_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = (int) (Math.random() * 4) + 3;
		
		int[][] array1 = new int [n][n];
		
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = (int) (Math.random() * 100) + 1;
				
				System.out.print(array1[i][j] + "\t");
			}
			System.out.println();
		}
		

        int suma = 0;
        for (int i = 0; i < array1.length; i++) {
            suma += array1[i][i];
        }
        
        System.out.println("La suma de la diagonal es: " + suma);
		
		sc.close();
	}

}
