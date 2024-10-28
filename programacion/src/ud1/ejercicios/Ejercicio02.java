package ud1.ejercicios;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int correcto, incorrecto;
		
		System.out.println("CUantas respuestas correctas ha tenido el alumno");
		correcto = Integer.parseInt(sc.nextLine());
		
		System.out.println("Y cuantas incorrectas");
		incorrecto = Integer.parseInt(sc.nextLine());
		
		System.out.println("La nota del alumno es " + ((correcto * 4) - incorrecto));
		sc.close();
	}

}
