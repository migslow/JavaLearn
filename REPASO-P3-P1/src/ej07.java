import java.util.Scanner;

public class ej07 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[20];
		rellenarArray(numeros);
		numerosPrimos(numeros);
	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 100);
		}
		
		System.out.println("\nEl array es: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static boolean esPrimo(int numero) {
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void numerosPrimos(int[] v) {
		System.out.println("\nLos numeros primos son: ");
		for (int i = 0; i < v.length; i++) {
			if (esPrimo(v[i])) {
				System.out.print(v[i] + " - ");
			}
		}
	}

}
