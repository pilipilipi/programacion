package ud1.arrays;

import java.util.Scanner;

public class Arrays06_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, acc = 0, index = 0;
		System.out.println("Dime el número de posiciones:");
		n = Integer.parseInt(sc.nextLine());
		
		int[] array = new int[n];
		
		System.out.println("Que numero quieres que sea la ultima posicion de los que guardemos");
		m = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 300) + 1;
			
			if (array[i] % 10 == m) {
				acc++;
			}
			
			System.out.print(array[i] + " ");		
		}	
		System.out.println();
		
		
		int[] array2 = new int[acc];
		
		for (int i = 0; i < array.length; i++) {			
			
			if (array[i] % 10 == m) {
				array2[index] = array[i];
				
				System.out.print(array2[index] + " ");
				index++;
			}			

		}

		sc.close();
	}

}
