package ud1.ejemplos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		
		System.out.println("Dime un número para calcular la serie de fibonacci");
		n = Integer.parseInt(sc.nextLine());
		
		if (n <= 0) {
            System.out.println("Por favor, introduce un número mayor que cero.");
            
        } else {
            // Calcular e imprimir la serie de Fibonacci
            System.out.print("Serie de Fibonacci hasta el término " + n + ": ");
            int a = 0, b = 1, c;

            // Imprimir el primer término si n es al menos 1
            if (n >= 1) {
            	System.out.print(a + " ");

            // Imprimir el segundo término si n es al menos 2
            } else if (n >= 2) {
            	System.out.print(b + " ");
            	}

            // Calcular los siguientes términos
            for (int i = 2; i < n; i++) {  // Inicia en 2 porque ya imprimimos los dos primeros términos
                c = a + b;  // Calcular el siguiente término
                System.out.print(c + " ");  // Imprimir el siguiente término
                a = b;  // Actualizar el valor de a
                b = c;  // Actualizar el valor de b
            }
        }
		
		sc.close();

	}

}
