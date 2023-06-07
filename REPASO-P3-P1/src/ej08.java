import java.util.Scanner;

public class ej08 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		ArrayInverso(numeros);
	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			v[i] = s.nextInt();
		}
		
		System.out.println("El array es: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static void ArrayInverso(int[]v) {
		System.out.println("\nEl array inverso es: ");
		for (int i = 9; i >= 0; i--) {
			System.out.print(v[i] + " - ");
		}
	}

}
