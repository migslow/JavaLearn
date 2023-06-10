import java.util.Scanner;

public class ej26 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[8];
		rellenarArray(numeros);
		visualizar(numeros);
	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			v[i] = s.nextInt();
		}
	}

	public static void visualizar(int[] v) {
		for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (esPar(v[i])) {
                System.out.println(" es par");
            } else {
                System.out.println(" es impar");
            }
        }
	}

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

}
