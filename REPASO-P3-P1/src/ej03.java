import java.util.Scanner;

public class ej03 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		System.out.println("\nHay " + comprobarNumerosMultiplosDeDos(numeros) + " numeros multiplos");

	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			v[i] = s.nextInt();
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static int comprobarNumerosMultiplosDeDos(int[]v) {
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}

}
