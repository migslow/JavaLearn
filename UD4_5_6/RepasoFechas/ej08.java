import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GregorianCalendar g = new GregorianCalendar();
		System.out.println("Introduce el dia: ");
		int dia = s.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = s.nextInt();
		System.out.println("Introduce el año: ");
		int anyo = s.nextInt();

		g.set(Calendar.DATE, dia);
		g.set(Calendar.MONTH, mes - 1);
		g.set(Calendar.YEAR, anyo);

		System.out.println(
				"La fecha es " + g.get(Calendar.DATE) + "/" + (g.get(Calendar.MONTH) + 1) + "/" + g.get(Calendar.YEAR));

	}

}
