package ej03;

public class ej26 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		rellenarNumeroAle(numeros);
	}
	
	public static void rellenarNumeroAle(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 100);
			System.err.println(v[i]);
		}
	}
	

}
