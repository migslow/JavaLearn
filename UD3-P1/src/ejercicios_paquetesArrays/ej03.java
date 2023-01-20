package ejercicios_paquetesArrays;

public class ej03 {

	public static void main(String[] args) {
		int[] numeros = new int[12];
		numeros[0] = 39;
		numeros[1] = -2;
		numeros[4] = 0;
		numeros[6] = 14;
		numeros[8] = 5;
		numeros[9] = 120;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento " + i + " --> " + numeros[i]);
		}

	}

}
