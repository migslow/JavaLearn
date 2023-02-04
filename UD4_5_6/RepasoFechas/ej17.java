import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ej17 {

	public static void main(String[] args) {
		// ejemplo 1
		Date d = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("La fecha actual es: " + formato.format(d));

		// ejemplo 2
		GregorianCalendar gc = new GregorianCalendar(2000, 01, 01);
		System.out.println("La fecha es: " + gc.get(Calendar.DATE) + "/" + (gc.get(Calendar.MONTH) + 1) + "/"
				+ gc.get(Calendar.YEAR));
		System.out.println("La fecha es: " + formato.format(gc.getTime()));

		// ejemplo 3
		Date d1 = new Date();
		d1.setDate(01);
		d1.setMonth(01);
		d1.setYear(100);
		System.out.println("La fecha es: " + formato.format(d1));

		// ejemplo 4
		GregorianCalendar gc1 = new GregorianCalendar(2000, 01, 01, 12, 00, 00);
		SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("La fecha es: " + formato1.format(gc1.getTime()));

		// ejemplo 5
		GregorianCalendar gc2 = new GregorianCalendar(2000, 01, 01, 12, 00, 00);
		gc2.add(Calendar.HOUR, -5);
		System.out.println("La fecha es: " + formato1.format(gc2.getTime()));

		// ejemplo 6
		GregorianCalendar gc3 = new GregorianCalendar();
		gc3.set(Calendar.HOUR_OF_DAY, 0);
		gc3.set(Calendar.MINUTE, 0);
		gc3.set(Calendar.SECOND, 0);
		gc3.set(Calendar.MILLISECOND, 0);
		System.out.println("La fecha es: " + formato1.format(gc3.getTime()));

		// ejemplo 7
		GregorianCalendar gc4 = new GregorianCalendar();
		gc4.set(Calendar.HOUR_OF_DAY, 23);
		gc4.set(Calendar.MINUTE, 59);
		gc4.set(Calendar.SECOND, 59);
		gc4.set(Calendar.MILLISECOND, 999);
		System.out.println("La fecha es: " + formato1.format(gc4.getTime()));

		// ejemplo 8
		GregorianCalendar FechaActual = new GregorianCalendar();
		GregorianCalendar FechaFutura = new GregorianCalendar();
		FechaFutura.set(Calendar.DATE, 21);
		FechaFutura.set(Calendar.MONTH, 6);
		FechaFutura.set(Calendar.YEAR, 2023);
		double fechaDiferencia = FechaFutura.getTimeInMillis() - FechaActual.getTimeInMillis();
		double diasDiferencia = fechaDiferencia / (1000 * 60 * 60 * 24);
		System.out.println("La diferencia de dias es: " + diasDiferencia);
		
		// ejemplo 9
		GregorianCalendar fechaActual = new GregorianCalendar();
		GregorianCalendar fechaFutura = new GregorianCalendar(2025, 11, 31, 23, 59, 59);
		long diferenciaEnMilisegundos = fechaFutura.getTimeInMillis() - fechaActual.getTimeInMillis();
		long diferenciaEnDias = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);
		System.out.println("La diferencia en días entre la fecha actual y 31/12/2025 es de: " + diferenciaEnDias + " días");
		
		

	}

}
