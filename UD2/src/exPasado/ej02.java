package exPasado;

public class ej02 {

	public static void main(String[] args) {
		int suma = 0;
		for (int i = 1; i <= 5000; i++) {
			suma = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					suma = suma + j;
				}

			}
			if (i == suma) {
				System.out.print(i + " - ");
			}
		} // del for
	}// del main
}
