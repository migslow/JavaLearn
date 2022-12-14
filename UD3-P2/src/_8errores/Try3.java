package _8errores;

/**
 * Intentemos provocar tambi�n un error de tipo divisi�n por cero y pongamos un
 * catch espec�fico para dicho error
 *
 * Podemos comprobar que se ejecuta el catch correspondiente al tipo de error
 * generado. La l�nea que lanza el error de �ndice la hemos comentado para que
 * no lo genere y podamos generar el error de divisi�n por cero.
 */

public class Try3 {
	public static void main(String arg[]) {
		int[] array = new int[20];
		try {
			array[56] = 24;
			int b = 0;
			int a = 23 / b;
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException excepcion) {
		 * System.out.println(" Error de �ndice en un array"); }
		 */
		catch (ArithmeticException excepcion) {
			System.out.println(" No se puede dividir entre 0");
		} catch (Exception e) {
			System.out.println("Aqu� entro si no lo he atrapado antes");
			System.out.println("Informaci�n del error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Esto se ejecuta seguro pase lo que pase");
		}
		System.out.println("Continuo por aqu� ....");
	}
}