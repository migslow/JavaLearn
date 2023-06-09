import java.util.Scanner;

public class ej16 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		cantidadNumeros(numeros);

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
	
	public static void cantidadNumeros(int[]v) {
		int contadorPares = 0, contadorImpares = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] % 2 == 0) {
				contadorPares++;
			} else {
				contadorImpares++;
			}
		}
		
		System.out.println("\nHay " + contadorPares + " en el array");
		System.out.println("\nHay " + contadorImpares + " en el array");
	}

}
