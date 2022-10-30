package ejerciciosWeb_paqueteArrays;

public class ej01 {

	public static void main(String[] args) {
		int matriz[] = new int[5];
		// Otra forma de establecer una matriz
		// int matriz [] ? {5, 38, -15, 92, 72, 95}
		matriz[0] = 5;
		matriz[1] = 38;
		matriz[2] = -15;
		matriz[3] = 92;
		matriz[4] = 71;
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Valor del indice: " + i + " = " + matriz[i]);
		}

	}

}
