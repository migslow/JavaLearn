package arrays_alumnos;

public class Ej39Array {
	public static void main(String[] args) {

		int n[] = { 34, 47, 22, -98 };
		// Vale tambi�n --> int [] n = {34, 47, 22, -98};

		System.out.print("Los valores del array n son los siguientes: ");
		System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);

		int suma = n[0] + n[3];
		System.out.println("\nEl primer elemento del array m�s el �ltimo suman " + suma);
	}

}
