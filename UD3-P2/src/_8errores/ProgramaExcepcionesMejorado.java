package _8errores;
/* 
 *Ejemplo Gesti�n de Excepciones Java Mejorado
 */

public class ProgramaExcepcionesMejorado {
	private static boolean esNumero(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "M";
		int n;
		try {
			System.out.println("Intentamos ejecutar el bloque de instrucciones:");
			System.out.println("Instrucci�n 1.");
			// int n = Integer.parseInt("M"); //error forzado en tiempo de ejecuci�n.
			if (esNumero(s)) {
				n = Integer.parseInt(s);
			} else {
				System.out.println("No puedo convertir " + s);
			}
			System.out.println("Instrucci�n 2.");
			System.out.println("Instrucci�n 3, etc.");
		} catch (Exception e) {
			System.out.println("Instrucciones a ejecutar cuando se produce un error");
		} finally {
			System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no.");
		}
	}
}