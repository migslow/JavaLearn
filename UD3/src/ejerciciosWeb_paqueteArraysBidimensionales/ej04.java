package ejerciciosWeb_paqueteArraysBidimensionales;

public class ej04 {

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = numerosAletarios();
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println("");
		}

	}
	
	public static int numerosAletarios() {
		return (int)(Math.random()*10);
	}

}
