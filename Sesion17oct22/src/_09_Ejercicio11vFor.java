import java.util.Scanner;

public class _09_Ejercicio11vFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0, may = 0, min = 0, num = 0;
		for (int i = 0; i <= 100000; i++) {
			System.out.println("introduce el carácter " + i);
			char c = sc.nextLine().charAt(0);
			if (c == 42)
				break;
			
			if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122) {
				if (c >= 48 && c <= 57)
					num++;
				if (c >= 65 && c <= 90)
					may++;
				if (c >= 97 && c <= 122)
					min++;
			}
		}
		System.out.println("cantidad de los numeros " + num);
		System.out.println("cantidad de los letras mayusculas " + may);
		System.out.println("cantidad de los letras de  minusculas " + min);
	}
}
