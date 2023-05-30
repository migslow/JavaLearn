package P3;

import java.util.Scanner;

public class ej02 {
	
	static Scanner s = new Scanner(System.in);

	public static boolean esMultiplo(int n1, int n2) {
		if (n1 % n2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce el primer numero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = s.nextInt();
		System.out.println(esMultiplo(n1, n2));

	}

}
