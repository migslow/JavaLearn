package Sesion19oct22;

public class ej01 {

	public static void main(String[] args) {
		// variables
		int n = 0;
		int suma = 0;
		int contador = 0;

		while (n != 50) {
			n = (int) (Math.random() * 101);
			contador++;
			System.out.println(n);
		}
		System.out.println();
		System.out.println("Hay " + (contador-1) + " numeros sin contar el 50");
		if (n == 50) {
			System.out.println("Ha aparecido un 50, se acabo.");
			System.exit(0);
		}

	}
}// del main
