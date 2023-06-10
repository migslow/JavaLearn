import java.util.Scanner;

public class ej23 {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		System.out.println("\nLa suma de las posiciones pares es: " + sumaPosicionPares(numeros));
		System.out.println("\nLa media de las posiciones impares es: " + promedioPosicionesImpares(numeros));
	}
	
	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			v[i] = s.nextInt();
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static int sumaPosicionPares(int[]v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			if(i % 2 == 0) {
				suma = suma + v[i];
			}
		}
		return suma;
	}
	
	public static double promedioPosicionesImpares(int[]v) {
		double suma = 0;
		for (int i = 0; i < v.length; i++) {
			if(i % 2 != 0) {
				suma = suma + v[i];
			}
		}
		return suma / v.length;
	}
}
