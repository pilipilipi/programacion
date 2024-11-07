package ud1.arrays;

import java.util.Scanner;

public class Arrays03_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [(int) (Math.random() * 11) + 5];
		int sum = 0, may = 0, men = 0, igual = 0;
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 100) + 1;
			
			System.out.print(array1[i]+ " ");
			sum += array1[i];
		}
		sum /= array1.length;
		System.out.println();
		
		for (int i = 0; i < array1.length; i++){
			if (array1[i] > sum) {
				may++;
				
			} else if (array1[i] < sum) {
				men++;
				
			} else {
				igual++;
			}
		}
		 
		System.out.println("La media es: " + sum + ", hay " + may + " por encima de la media, " + men + " por debajo y " + igual + " en la media");
		
		sc.close();
	}

}
