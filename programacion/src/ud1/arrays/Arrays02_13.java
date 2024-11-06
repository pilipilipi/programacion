package ud1.arrays;

import java.util.Scanner;

public class Arrays02_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1;
		int v, i, n;
		
		System.out.println("Dime un valor inicial:");
		v = Integer.parseInt(sc.nextLine());
		
		System.out.println("Que incremento quieres aplicar");
		i = Integer.parseInt(sc.nextLine());
		
		System.out.println("Cuantos números quieres en la secuencia");
		n = Integer.parseInt(sc.nextLine());
		
		array1 = new int [n];
		
		for (int j = 0; j < array1.length; j ++) {
			array1[j] = v + (i * j);
			System.out.print(array1[j] + " ");
		}
		
		sc.close();
	}

}
