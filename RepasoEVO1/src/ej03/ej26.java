package ej03;

public class ej26 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros = rellenarNumeroAle(numeros);
		}
		System.out.println(numeros);
	}
	
	public static int[] rellenarNumeroAle(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random()*100);
		}
		return v;
	}

}
