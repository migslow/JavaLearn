package fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nFecha actual: ");
		LocalDate f = LocalDate.now();
		System.out.println(f);
		
		int dia = f.getDayOfMonth();
		int mes = f.getMonthValue();
		int anyo = f.getYear();
		
		System.out.println(f);
		
		System.out.println("\nComprobar fechas: ");
		LocalDate f1 = LocalDate.of(2009, 8, 21);
		System.out.println(f.isAfter(f1));
		System.out.println(f.isBefore(f1));
		System.out.println(f.isEqual(f1));

	}

}
