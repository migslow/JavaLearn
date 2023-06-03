package fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el dia: ");
		int dia = s.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = s.nextInt();
		System.out.println("Introduce el año: ");
		int anyo = s.nextInt();
		LocalDate f = LocalDate.of(anyo, mes, dia);

		System.out.println(f.getDayOfWeek());
	}

}
