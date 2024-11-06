package ud1.arrays;

import java.util.Scanner;

public class Arrays028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] array1 = new double [100];
		double n;
		int m;
		int mayor = 0, igual = 0, menor = 0;
		
		for (int i = 0; i < array1.length; i ++) {
			array1[i] = Math.round(Math.random() * 10.0) / 10.0;
		}
		
		System.out.println("Dime un numero del 0.0 a 1.0");
		n = Double.parseDouble(sc.nextLine());
		
		for (int i = 0; i < array1.length; i ++) {
			if (array1[i] > n) {
				mayor++;
				
			} else if (array1[i] == n) {
				igual++;
				
			} else {
				menor++;
			}
		}
		
		System.out.println("Hay " + mayor + " numeros mayores, " + igual + " iguales y " + menor + " menores \n");
		
		
		//ej 2.9
		
		System.out.println("Dime un numero del 1 al 10");
		m = Integer.parseInt(sc.nextLine());
		
		System.out.print("El número " + m + " se encuentra en las posiciones: ");
		
		for (int i = 0; i < array1.length; i ++) {
			array1[i] = (int) (Math.random() * 11 + 1);
			
			if (array1[i] == m) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}
