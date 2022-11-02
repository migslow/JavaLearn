package ejercicios_paquetesArrays;

public class ej04 {

	public static void main(String[] args) {
		char[] numeros = new char[10];
		numeros[0] = 'a';
		numeros[1] = 'x';
		numeros[4] = '@';
		numeros[6] = ' ';
		numeros[7] = '+';
		numeros[8] = 'Q';

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento " + i + " --> " + numeros[i]);
		}

	}

}
