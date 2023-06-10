package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ej13 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		System.out.println("Introduce la edad (yyyy-MM-dd): ");
		String fechaNacimiento = s.nextLine();

		Date fechaActual = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaNac = formato.parse(fechaNacimiento);
		long diferencia = fechaActual.getTime() - fechaNac.getTime();
		long milisegundos = 1000 * 60 * 60 * 24 * 365;
		int edad = (int) (diferencia / milisegundos);
		System.out.println("Su edad actual es: " + edad + " años");
	}

}
