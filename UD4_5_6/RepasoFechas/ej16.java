import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ej16 {

	public static void main(String[] args) {
		Date fechaHora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("La fecha actual es: " + formato.format(fechaHora));

		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("La fecha actual es: " + gc.get(Calendar.DATE) + "/" + (gc.get(Calendar.MONTH) + 1) + "/"
				+ gc.get(Calendar.YEAR) + " " + gc.get(Calendar.HOUR) + ":" + gc.get(Calendar.MINUTE) + ":"
				+ gc.get(Calendar.SECOND));

		GregorianCalendar gc1 = new GregorianCalendar(2000, 01, 01, 10, 30, 15);
		gc1.add(Calendar.YEAR, 10);
		gc1.add(Calendar.DATE, 3);
		gc1.add(Calendar.HOUR, 2);
		System.out.println("La fecha actual es: " + gc1.get(Calendar.DATE) + "/" + (gc1.get(Calendar.MONTH) + 1) + "/"
				+ gc1.get(Calendar.YEAR) + " " + gc1.get(Calendar.HOUR) + ":" + gc1.get(Calendar.MINUTE) + ":"
				+ gc1.get(Calendar.SECOND));
	}

}
