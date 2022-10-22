import java.util.Scanner;

/*
 LEER DATO
 MIENTRAS NO SEA EL FINAL DE LA SECUENCIA
 		TRABAJAR CON EL DATO
 		LEER DATO
 FIN MIENTRAS
 SIGUIENTE INTRUCCI�N
 */
public class _11_Ejercicio11vWhileBuena {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int suma = 0, may = 0, min = 0, num = 0;
		System.out.println("introduce el car�cter"); // LINEA 3
		c = sc.nextLine().charAt(0); // LINEA 3
		while (c != '*') { // LINEA 4
			if (c == 42) // if (c='*')
				break;
			if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122) {
				if (c >= 48 && c <= 57) // (c >= '0' && c <= '9')
					num++;
				if (c >= 65 && c <= 90) // (c >= 'A' && c <= 'Z')
					may++;
				if (c >= 97 && c <= 122)
					min++;
			}
			System.out.println("introduce el car�cter"); // LINEA 6
			c = sc.nextLine().charAt(0); // LINEA 6
		}
		System.out.println("cantidad de los numeros " + num); // LINEA 8
		System.out.println("cantidad de los letras mayusculas " + may);
		System.out.println("cantidad de los letras de  minusculas " + min);
	}
}
