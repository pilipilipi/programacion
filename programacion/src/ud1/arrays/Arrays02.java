package ud1.arrays;

import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [10];
		int sum = 0, maximo = 0;
		int minimo = 0;
		
		int[] array2 =new int [20];
		int sumn = 0, sump = 0;
		
		int [] array3;
		int n, m;
		
		int[] array4;
		int p, q, mayor, menor;
		
		for (int i = 0; i < array1.length; i ++) {
			System.out.println("Dime un número:");		
			array1[i] = Integer.parseInt(sc.nextLine());
		}
			
		//ej1
		
		System.out.print(array1[0]);
		
		for (int i = 1; i < array1.length; i++) {			
			System.out.print(" + " + array1[i]);
		}
		
		//ej2
		
		for (int i = 0; i < array1.length; i++) {			
			sum += array1[i];
		}
		System.out.println(" = " + sum + "\n");
		
		//ej3 
		
		for (int i = 1; i < array1.length; i++) {			
			if (array1[i] > array1[maximo]) {
                maximo = i;
            }
            if (array1[i] < array1[minimo]) {
                minimo = i;
            }
		}
		
		System.out.println("El mayor es " + array1[maximo] + " y el menor " + array1[minimo] + "\n");		
		
		
		for (int i = 0; i < array2.length; i ++) {
			System.out.println("Dime un número negativo o positivo:");		
			array2[i] = Integer.parseInt(sc.nextLine());
		}
		
		//ej4
		
		if (array2[0] > 0) {
			System.out.print(array2[0]);
		}
		
		for (int i = 1; i < array2.length; i ++) {			
			if (array2[i] > 0) {
				sump += array2[i];	
				System.out.print(" + " + array2[i]);
			}
		}
		System.out.println(" = " + sump + "\n");
		
		
		for (int i = 0; i < array2.length; i ++) {			
			if (array2[i] < 0) {
				sumn += array2[i];
				System.out.print(array2[i]);
			}
		}
		System.out.print(" = " + sumn);
		
		//ej5
		
		sum = 0;
		
		for (int i = 0; i < array2.length; i++) {
			sum += array2[i];
		}
		System.out.println("La media de todos los numeros es: " + sum / array2.length);
		
		//ej6
		
		System.out.println("Dime la longitud del array");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el numero para introducir");
		m = Integer.parseInt(sc.nextLine());
		
		array3 = new int [n];
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = m;
			System.out.print(array3[i] + " ");
		}
		
		//ej7
		sum = 0;
		
		System.out.println("Dime dos números");
		p = Integer.parseInt(sc.nextLine());
		q = Integer.parseInt(sc.nextLine());
		
		if (p > q) {
			mayor = p;
			menor = q;
		} else {
			mayor = q;
			menor = p;
		}
		
		sum = mayor - menor;
		array4 = new int [sum];
		
		for (int i = 0; i < array4.length; i ++) {
			array4[i] = menor;
			menor++;
			System.out.print(array4[i] + " ");
		}
		
		sc.close();
	}

}
