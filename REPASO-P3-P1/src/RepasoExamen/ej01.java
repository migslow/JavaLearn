package RepasoExamen;

public class ej01 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		rellenarArray(numeros);
		System.out.println("\nEl maximo es: " + maximo(numeros));
		System.out.println("El minimo es: " + minimo(numeros));
	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) ((Math.random() * 101) + 1);
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static int maximo(int[]v) {
		int max = v[0];
		for (int i = 0; i < v.length; i++) {
			if(v[i] > max) {
				max = v[i];
			}
		}
		return max;
	}
	
	public static int minimo(int[]v) {
		int min = v[0];
		for (int i = 0; i < v.length; i++) {
			if(v[i] < min) {
				min = v[i];
			}
		}
		return min;
	}

}
