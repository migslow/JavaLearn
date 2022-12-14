package _8errores;
/**
 * Escriba un programa que genere un n�mero aleatorio
 * e indique si el n�mero generado es par o impar.
 * El programa utilizar� para ello el lanzamiento de una excepci�n.
 */

/**
 * Escriba un programa que genere un n�mero aleatorio e indique si el n�mero
 * generado es par o impar. El programa utilizar� para ello el lanzamiento de
 * una excepci�n.
 */

public class ExcepcionParImpar {

	public static void main(String args[]) {
		try {
			System.out.println("Generando numero aleatorio .... ");
			int entero = (int) (Math.random() * 100);
			if (entero % 2 == 0) {
				throw new Exception("Se gener� el numero par: " + entero);
			} else {
				throw new Exception("Se gener� el numero impar: " + entero);
			}
			// System.out.println("Esta l�nea no se ejecutar� nunca");
			// y de hecho me da error de compilaci�n si la pongo
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}