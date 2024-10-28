package ud1.ejemplos;

import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String repetir;

		do {
			System.out.println("Hace mucho tiempo, en las profundidades del mar, el Capitán Barba Negra escondió\r\n"
					+ "un tesoro imposible de encontrar... a menos que resuelvas los códigos ocultos que\r\n"
					+ "lo protegen.\r\n"
					+ "El Capitán Marina, junto a su tripulación de valientes marineros, ha encontrado un\r\n"
					+ "mapa antiguo y se embarca en una misión para recuperar el tesoro. ¿Estás listo para\r\n"
					+ "unirte a la aventura? (Presiona Intro para continuar)");

			sc.nextLine();

			int x, y, respuesta1, solucion1 = 0;

			x = (int) (Math.random() * (10 - 1)) + 1;
			y = (int) (Math.random() * (30 - 20)) + 20;

			System.out.println();
			System.out.println("NIVEL 1:");
			System.out.println();
			System.out.println("La tripulación se encuentra en la isla Tortuga, buscando el primer código. Deben\r\n"
					+ "descifrar una clave oculta en las coordenadas de un mapa que encontraron. El\r\n"
					+ "Capitán Marina se da cuenta de que las coordenadas están codificadas como una\r\n"
					+ "suma de números pares consecutivos que faltan en el mapa.\r\n"
					+ "El código de la coordenada se obtiene sumando los números pares comprendidos\r\n"
					+ "entre el punto X y el punto Y: (" + x + ", " + y + ") (ambos inclusive). ¿Qué valor es?");

			respuesta1 = Integer.parseInt(sc.nextLine());

			for (int i = x; i <= y; i++) {
				if (i % 2 == 0) {
					solucion1 += i;
				}
			}

			if (respuesta1 == solucion1) {
				int respuesta2, solucion2;

				x = (int) (Math.random() * 7) + 1;
				y = (int) (Math.random() * (12 - 8)) + 8;

				System.out.println();
				System.out.println("NIVEL 2:");
				System.out.println();
				System.out.println(
						"Tras resolver el primer código, la tripulación se adentra en la selva. De repente,\r\n"
								+ "encuentran una estatua antigua con una inscripción que indica: \"Solo quien resuelva\r\n"
								+ "el productorio de la llave abrirá el camino al siguiente punto\". El código está\r\n"
								+ "compuesto por dos números, el número del guardián: " + x + " y el número del mapa: "
								+ y + ", cuya\r\n"
								+ "resta descendente, incluyendo ambos valores, debe ser calculada. ¿Qué código\r\n"
								+ "crees que puede ser?");

				respuesta2 = Integer.parseInt(sc.nextLine());

				solucion2 = y;

				for (int i = y - 1; i >= x; i--) {
					solucion2 -= i;
				}

				if (respuesta2 == solucion2) {
					int respuesta3, solucion3 = 1;

					x = (int) (Math.random() * (20 - 2)) + 2;

					System.out.println();
					System.out.println("NIVEL 3:");
					System.out.println();
					System.out
							.print("Superan la selva y llegan a una cueva. Para entrar, deben desactivar una trampa\r\n"
									+ "mortal usando un código antiguo que solo los piratas más astutos conocen. La pista\r\n"
									+ "dice que el código es el factorial del número de entradas de la cueva dividido entre\r\n"
									+ "2, redondeando hacia abajo. ¿Sabrías decir cuál es ese número? ");

					System.out.println("Hay " + x + " entradas");
					respuesta3 = Integer.parseInt(sc.nextLine());

					x /= 2;
					// Los enteros ya se redondean hacia abajo

					for (int i = 1; i <= x; i++) {
						solucion3 *= i;
					}

					if (respuesta3 == solucion3) {
						int respuesta4, solucion4, sx = 0, sy = 0;

						x = (int) (Math.random() * (100 - 10)) + 10;
						y = (int) (Math.random() * (100 - 10)) + 10;

						System.out.println();
						System.out.println("NIVEL 4:");
						System.out.println();
						System.out.println(
								"Dentro de la cueva, encuentran un antiguo cofre protegido por una cerradura\r\n"
										+ "numérica. La inscripción dice: \"Solo si puedes descifrar si los dos números que se\r\n"
										+ "proporcionarán son amigos, lograrás abrirlo\". Debes verificar si los números \r\n"
										+ x + ", " + y
										+ " son amigos. Sólo dime, 1 si crees que lo son o 0 si crees que no lo son.");

						respuesta4 = Integer.parseInt(sc.nextLine());

						for (int i = 1; i < x; i++) {
							if (x % i == 0) {
								sx += i;
							}
						}
						for (int j = 1; j < y; j++) {
							if (y % j == 0) {
								sy += j;
							}
						}

						if (sx == y && sy == x) {
							solucion4 = 1;
						} else {
							solucion4 = 0;
						}

						if (respuesta4 == solucion4) {
							int respuesta5, solucion5, acc = 0;

							x = (int) (Math.random() * 100) + 1;

							System.out.println();
							System.out.println("NIVEL 5:");
							System.out.println();
							System.out.println(
									"Dentro del cofre encuentran el tesoro y ya se disponen a volver al barco con \r\n"
											+ "con el botín, pero... De repente, se cierra una puerta secreta en la cueva dejándoles encerrados\r\n"
											+ "y el techo de la cueva empieza a ceder, solo tienes unos pocos minutos para adivinar si\r\n"
											+ "el número " + x
											+ " que aparece en la puerta es primo, y así desbloquear la puerta y salirse con la suya\r\n"
											+ "si lo es, pon un 1 y sino un 0.");

							respuesta5 = Integer.parseInt(sc.nextLine());

							for (int i = 2; i < x; i++) {
								if (x % i == 0) {
									acc++;
								}
							}

							if (acc == 0) {
								solucion5 = 1;
							} else {
								solucion5 = 0;
							}

							if (respuesta5 == solucion5) {
								System.out.println(
										"ENHORABUENA!!! Has completado el juego y los piratas se han llevado el botín");

							} else {
								System.out.println(
										"Incorrectoo, has perdido y los piiratas han quedado encerrados en la cueva,\r\n"
												+ "la solucion era: " + solucion5);
							}
						} else {
							System.out.println("Incorrectoo, has perdido y el cofre ha quedado bloqueado,\r\n"
									+ "la solucion era: " + solucion4);
						}
					} else {
						System.out.println("Incorrectoo, has perdido y los piratas han caido en la trampa,\r\n"
								+ "la solucion era: " + solucion3);
					}
				} else {
					System.out.println("Incorrectoo, has perdido y la estatua se ha destruido para siempre,\r\n"
							+ "la solucion era: " + solucion2);
				}
			} else {
				System.out.println("Incorrectoo, has perdido y los piratas no han conseguido descifrarlo,\r\n"
						+ "la solucion era: " + solucion1);
			}
			System.out.println();
			System.out.println("Quieres volver a jugar? pon si o no:");
			repetir = sc.nextLine();

		} while (repetir.equalsIgnoreCase("si"));
		
		System.out.println();
		System.out.println("Juego terminado.");

		sc.close();
	}

}
