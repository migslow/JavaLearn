package _8errores;

/**
 * Ejemplo Excepciones Correcto. Intentamos acceder a una posici�n de vector
 * erronea
 */

public class TryCorrecto {
	public static void main(String arg[]) {
		int[] array = new int[20];
		try {

			// Se produce un error al intentar acceder a la posici�n 25 del vector.
			array[30] = 24;
		}

		// Aqu� se captura la excepci�n generada
		catch (ArrayIndexOutOfBoundsException excepcion) {
			System.out.println(" Error de �ndice en un array");
			// Lo que sigue abajo para transparencia 9
			// System.out.println(excepcion.getMessage());
			// excepcion.printStackTrace();
		}

	}
}
