package _8errores;

public class PruebaErrores {

	public static void main(String[] args) {
		try {
			int[] numeros = new int[10];
			numeros[8] = 25;
			System.out.println("Soy la instruccion AA");
			System.out.println("Soy la instruccion BB");
			numeros[10] = 33;
			System.out.println("Soy la instruccion CC");
			System.out.println("Soy la instruccion DD");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Has excedido el limite del array.");
		} finally {
			System.out.println("Esto se ejecuta si o si. FIN");
		}
	}

}
