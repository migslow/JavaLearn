package ej03;

public class ej30 {

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		rellenarArray(numeros);
	}
	
	public static void rellenarArray(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				v[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static int calcularFilasPares(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			int sumaFilas = 0;
			for (int j = 0; j < v.length; j++) {
				if(v[i][j] % 2 == 0) {
					sumaFilas = sumaFilas + v[i][j];
				}
			}
		}
		return su;
	}

}
