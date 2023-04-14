import java.util.Scanner;

public class ej02 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el primer numero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = s.nextInt();
		esMultiplo(n1, n2);

	}

	public static void esMultiplo(int n1, int n2) {
		if (n1 % n2 == 0) {
			System.out.println(n1 + " es multiplo de " + n2);
		} else {
			System.out.println(n1 + " no es multiplo de " + n2);
		}
	}

}
