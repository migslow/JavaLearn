import java.util.Scanner;

public class ej22 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		encontrarElementoMasRepetido(numeros);
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
	
	 public static void encontrarElementoMasRepetido(int[] vector) {
	        int elementoMasRepetido = 0;
	        int max = 0;

	        for (int i = 0; i < vector.length; i++) {
	            int frecuencia = 0;
	            for (int j = 0; j < vector.length; j++) {
	                if (vector[i] == vector[j]) {
	                    frecuencia++;
	                }
	            }

	            if (frecuencia > max) {
	                max = frecuencia;
	                elementoMasRepetido = vector[i];
	            }
	        }

	        System.out.println("\nEl elemento mas repetido es: " + elementoMasRepetido);
	    }
}
