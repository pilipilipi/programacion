package ud1.arrays;

import java.util.Scanner;

public class Arrays02_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] array1;
		double n, h, suma;
		int m, max = 0, min = 0, acc = 0, acc2 = 0;

		System.out.println("Dime tu altura");
		n = Double.parseDouble(sc.nextLine());

		System.out.println("Dime cuantas alturas quieres ingresar");
		m = Integer.parseInt(sc.nextLine());

		array1 = new double[m];
		suma = n;

		for (int i = 0; i < array1.length; i++) {

			System.out.println("Dime otra altura: ");
			h = Double.parseDouble(sc.nextLine());
			array1[i] = h;
			suma += h;

			if (array1[i] > array1[max]) {
				max = i;

			} else if (array1[i] < array1[min]) {
				min = i;
			}
		}

		suma /= m;
		
		System.out.print("La media de altura es: " + suma + ", la mas alta es: " + array1[max] +  ", la menor: \n" 
		+ array1[min]);

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] > suma) {
				acc++;
				
			} else {
				acc2++;
			}
		}
		
		System.out.println(" y hay " + acc + " personas por encima de la media \n" + 
		"y " + acc2 + " por debajo");

		sc.close();
	}

}
