import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el tamaño del array: ");
		int t = s.nextInt();
		double[] alturas = new double[t];
		if(t > 0) {
			System.out.println("Introduce las alturas: ");
			for (int i = 0; i < alturas.length; i++) {
				System.out.println("Introduce la altura en la posicion: [" + i + "]");
				alturas[i] = s.nextDouble();
			}
			
			System.out.println("\nEl array es: ");
			for (int i = 0; i < alturas.length; i++) {
				System.out.print(alturas[i] + " - ");
			}
		} else {
			System.out.println("Has introducido una altura negativa: ");
			System.exit(-1);
		}
		
		System.out.println("\nLa altura media es: " + media(alturas));
		System.out.println("\nHay " + mediaSuperior(alturas) + " alturas superiores");
		System.out.println("\nHay " + mediaInferior(alturas) + " alturas inferiores");
	}
	
	public static double media(double[]alturas) {
		double media = 0, suma = 0;
		for (int i = 0; i < alturas.length; i++) {
			suma = suma + alturas[i];
		}
		return media = suma / alturas.length;
	}
	
	public static int mediaSuperior(double[] alturas) {
		int contador = 0;
		for (int i = 0; i < alturas.length; i++) {
			if(alturas[i] >= media(alturas)) {
				contador++;
			}
		}
		return contador;
	}

	public static int mediaInferior(double[] alturas) {
		int contador = 0;
		for (int i = 0; i < alturas.length; i++) {
			if(alturas[i] < media(alturas)) {
				contador++;
			}
		}
		return contador;
	}

}
