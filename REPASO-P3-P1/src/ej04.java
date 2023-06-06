import java.util.Scanner;

public class ej04 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		calcularPositivos(numeros);
		calcularNegativos(numeros);
	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]: ");
			v[i] = s.nextInt();
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}

	public static void calcularPositivos(int[]v) {
		int suma = 0;
		double media = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] > 0) {
				suma = suma + v[i];
			}
		}
		media = suma / v.length;
		System.out.println("\nLa media de los numeros positivos es: " + media);
	}
	
	public static void calcularNegativos(int[]v) {
		int suma = 0;
		double media = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] < 0) {
				suma = suma + v[i];
			}
		}
		media = suma / v.length;
		System.out.println("\nLa media de los numeros negativos es: " + media);
	}

}
