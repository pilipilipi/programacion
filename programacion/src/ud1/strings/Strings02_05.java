package ud1.strings;

import java.util.Scanner;

public class Strings02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String parrafo;
		
		System.out.println("Escribe un parrafo");
		parrafo = sc.nextLine();
		
		String[] oraciones = parrafo.split("\\.");		
		System.out.println("Tiene " + oraciones.length + " oraciones");
		
		String[] palabras = parrafo.split(" ");
		System.out.println("Tiene " + palabras.length + " oraciones");
		
		System.out.println(parrafo.replace(" ", "").length());
		
		sc.close();
	}

}
