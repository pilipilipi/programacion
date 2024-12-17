package ud1.ejemplos;

import java.util.Scanner;

public class BrechaSalarial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, sumh = 0, summ = 0, hom = 0, muj = 0;
		
		System.out.println("dime el numero de personas");
		n = Integer.parseInt(sc.nextLine());
		
		int[][] matriz = new int[n][2];
		
		for(int i = 0; i < matriz.length; i++) {
			
			
				System.out.println("Es hombre o mujer? 0 para hombre 1 para mujer");
				matriz [i][0] = Integer.parseInt(sc.nextLine());
				
				System.out.println("Dime su salario");
				matriz [i][1] = Integer.parseInt(sc.nextLine());
				
				if (matriz [i][0] == 1) {
					summ += matriz [i][1];
					muj++;
					
				} else if (matriz [i][0] == 0) {
					sumh += matriz [i][1];
					hom++;
				}
			
		}
		
		System.out.println();
		System.out.println("El salario medio de los hombres es: " + sumh/hom + " y el de las mujeres: " + summ/muj);
		
		sc.close();
	}

}
