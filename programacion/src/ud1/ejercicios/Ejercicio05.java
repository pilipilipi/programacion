package ud1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
		
		int numero = (int) (Math.random() * 500) + 1, adivina;
		int acc = 10;
		
//		do {
//			numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un número del 1 al 500"));
//		} while (numero > 500 || numero < 1);
//		
		adivina = Integer.parseInt(JOptionPane.showInputDialog("Adivina un número del 1 al 500, tienes 10 intentos"));
		acc--;
		
		do {
			
		if (adivina < numero) {
			adivina = Integer.parseInt(JOptionPane.showInputDialog("Incorrecto! mas arriba te quedan " + (acc) + " intentos"));
			acc--;
		
		} else if (adivina > numero) {
			adivina = Integer.parseInt(JOptionPane.showInputDialog("Maal mas pequeño te quedan " + (acc) + " intentos"));
			acc--;
			
		} else if (adivina > 100 || adivina < 1) {
			adivina = Integer.parseInt(JOptionPane.showInputDialog("No está entre 1 y 100, te quedan " + (acc) + " intentos"));
			acc--;
			
		} else acc--;
		
	} while (adivina != numero && acc != 0);

	if (adivina == numero) {
		JOptionPane.showMessageDialog(null, "Correcto!! lo has conseguido en " + (10 - acc) + " intentos");
		
	} else 
		JOptionPane.showMessageDialog( null, "Te has quedado sin intentos el numero era " + numero);
	
		
//		System.out.println("Dime un número del 1 al 100");
//		numero = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("Adivina un número del 1 al 100");
//		
//		do {
//			adivina = Integer.parseInt(sc.nextLine());
//			
//			if (adivina < numero) {
//				System.out.println("Incorrecto! mas arriba");
//				acc--;
//			
//			} else if (adivina > numero) {
//				System.out.println("Maal mas pequeño");
//				acc--;
//				
//			} else acc--;
//			
//		} while (adivina != numero || acc == 0);
//
//		if (adivina == numero) {
//			System.out.println("Correcto!! lo has conseguido en " + (10 - acc) + " intentos");
//			
//		} else 
//			System.out.println("Te has quedado sin intentos");
//		
//		sc.close();
	}

}
