package ejercicios;

public class ej08 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;

		x = y;
		z = x;
		y = z;

		System.out.println("La variable x es: " + y);
		System.out.println("La variable z es: " + x);
		System.out.println("La variable y es: " + z);

	}

}
