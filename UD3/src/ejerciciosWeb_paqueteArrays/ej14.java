package ejerciciosWeb_paqueteArrays;

/*
 * Guardar en un array los 20 primeros números pares
 */

public class ej14 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int contador = 2;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = contador;
			contador+=2;
		}
		 for (int i = 0; i < numeros.length; i++) {
	         System.out.println(numeros[i]);
	     }
	}

}
