import java.util.Scanner;

public class ej12 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		double[] notas = new double[5];
		rellenarArray(notas);
		calcularNotas(notas);

	}

	public static void rellenarArray(double[] n) {
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 0) {
				System.out.print("Introduce la nota en la posicion [" + i + "]: ");
				n[i] = s.nextDouble();
			}
			if (n[i] < 0) {
				break;
			}
		}

		System.out.println("\nLas notas son: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " - ");
		}
	}

	public static void calcularNotas(double[] n) {
		double media = 0, suma = 0;
		int contadorApro = 0;
		int contadorSus = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 5) {
				contadorApro++;
			}
			if (n[i] < 5) {
				contadorSus++;
			}
			suma = suma + n[i];
		}
		media = suma / n.length;

		System.out.println("\nEl numero de aprobados es: " + contadorApro);
		System.out.println("El numero de suspendidos es: " + contadorSus);
		System.out.println("La media es: " + media);
	}

}
