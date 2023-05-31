

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = s.nextInt();
		System.out.println("Introduce el tercer numero: ");
		int n3 = s.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + " es el mayor");
		} else if(n2 > n1) {
			System.out.println(n2 + " es el mayor");
		} else if(n3 > n1 || n3 > n2) {
			System.out.println(n3 + " es el mayor");
		}

	}

}
