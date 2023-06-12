import java.util.Scanner;

public class ej28 {
	
	/*
	 * Crea un array de números de un tamaño pasado por teclado, 
	 * el array contendrá números aleatorios primos entre los números deseados, por último nos indica cual 
	 * es el mayor de todos.
	   Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.
	 */
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el tamaño del array: ");
		int t = s.nextInt();
		int[] numeros = new int[t];
		rellenarArray(numeros);
		System.out.println("\nEl numero maximo es: " + maximo(numeros));

	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 21);
			if(esPrimo(v[i])) {
				System.out.print(v[i] + " - ");
			}
		}
	}
	
	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
	        return false;
	    }
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int maximo(int []v) {
		int max = v[0];
		for (int i = 0; i < v.length; i++) {
			if(v[i] > max) {
				max = v[i];
			}
		}
		return max;
	}

}
