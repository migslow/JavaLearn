package ejercicios_paquetesArrays;

public class ej02 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento " + i + " --> " + (int) (Math.random() * 100));
		}

	}

}
