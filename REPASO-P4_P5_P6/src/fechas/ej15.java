package fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ej15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la fecha de nacimiento (yyyy-MM-dd): ");
		String fechaNacimientoStr = scanner.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
		LocalDate fechaActual = LocalDate.now();

		Period periodo = Period.between(fechaNacimiento, fechaActual);
		int edad = periodo.getYears();

		System.out.println("Su edad actual es: " + edad + " años");
	}
}
