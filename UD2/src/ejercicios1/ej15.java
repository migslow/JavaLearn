package ejercicios1;

public class ej15 {

	public static void main(String[] args) {
		int contador = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if (contador == 2) {
				contador++;
			}
		}
	}
}
