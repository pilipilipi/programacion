package metodos.ejercicios;
import java.util.Scanner;

public class Ejercicios02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Dime un numero para pasarlo a binario");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Binario: " + binario(n));
		sc.close();
	}

	
	public static String binario(int n) {
		String binario = "";
		
		while (n > 0) {
            binario = (n % 2) + binario; 
            n /= 2;
        }

        return binario;
	}
}
