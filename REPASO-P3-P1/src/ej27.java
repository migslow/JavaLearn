import java.util.Scanner;

public class ej27 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[9];
		rellenarArray(numeros);
		System.out.println("\nLa suma de todo el array es: " + suma(numeros));
	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " ");
		}
	}
	
	public static int suma (int[]v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i];
		}
		return suma;
	}

}
