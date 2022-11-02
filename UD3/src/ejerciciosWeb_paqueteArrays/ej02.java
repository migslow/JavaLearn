package ejerciciosWeb_paqueteArrays;

/*
 * Crea un array que contenga los numeros del 1 al 100. Muestralos por pantalla.
 * Con el array creado anteriormente, calculoa la suma y la media de todos los valores.
 */

public class ej02 {

	public static void main(String[] args) {
		int SumaNumeros[] = new int[100];
		int suma = 0;
		for (int i = 0; i < SumaNumeros.length; i++) {
			SumaNumeros[i] = i + 1;
			suma = suma + SumaNumeros[i];
		}
		System.out.println("La suma de todos los numeros son: " + suma);
		System.out.println("La media es: " + (double) suma / SumaNumeros.length);

	}

}
