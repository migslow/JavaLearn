package ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ej01c {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GregorianCalendar f = new GregorianCalendar();

		System.out.println("Introduce el dia: ");
		int dia = s.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = s.nextInt();
		System.out.println("Introduce el año: ");
		int anyo = s.nextInt();

		f.set(Calendar.DAY_OF_WEEK, dia);
		f.set(Calendar.MONTH, mes - 1);
		f.set(Calendar.YEAR, anyo);

		if (f.get(Calendar.DAY_OF_WEEK) == 2) {
			System.out.println("Lunes");
		}
		if (f.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println("Martes");
		}
		if (f.get(Calendar.DAY_OF_WEEK) == 4) {
			System.out.println("Miercoles");
		}
		if (f.get(Calendar.DAY_OF_WEEK) == 5) {
			System.out.println("Jueves");
		}
		if (f.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println("Viernes");
		}
		if (f.get(Calendar.DAY_OF_WEEK) == 7) {
			System.out.println("Sabado");
		}
		if (f.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println("Domingo");
		}

	}

}
