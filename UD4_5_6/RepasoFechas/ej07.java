import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ej07 {

	public static void main(String[] args) {
		GregorianCalendar c = new GregorianCalendar();
		int dia = c.get(Calendar.DATE);
		int mes = c.get(Calendar.MONTH + 1);
		int anyo = c.get(Calendar.YEAR);

		System.out.println("La fecha es " + dia + "/" + mes + "/" + anyo);

		c.set(2014, 2, 15);
		System.out.println(
				"La fecha es " + c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
	}

}
