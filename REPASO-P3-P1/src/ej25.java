import java.util.Scanner;

public class ej25 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros1 = { 1, 2, 3, 4 };
		int[] numeros2 = { 1, 2, 3, 4 };
		comparar(numeros1, numeros2);
	}

	public static void comparar(int[] v, int[] a) {
		boolean sonIguales = true;

        if (v.length != a.length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < v.length; i++) {
                if (v[i] != a[i]) {
                    sonIguales = false;
                    break;
                }
            }
        }

        if (sonIguales) {
            System.out.println("Los dos arrays son iguales.");
        } else {
            System.out.println("Los dos arrays no son iguales.");
        }
	}

}
