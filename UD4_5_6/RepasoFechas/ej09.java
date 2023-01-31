import java.util.GregorianCalendar;
import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GregorianCalendar fechaHoy = new GregorianCalendar();
		GregorianCalendar fechaIngresada = new GregorianCalendar();
		
		System.out.println("Introduce el dia: ");
		int dia = s.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = s.nextInt();
		System.out.println("Introduce el año: ");
		int anyo = s.nextInt();
		
		fechaIngresada.set(dia, mes - 1, anyo);
		
		long diferencia = fechaHoy.getTimeInMillis() - fechaIngresada.getTimeInMillis();
		long calculo = diferencia / (24 * 60 * 60 * 1000);
		
		System.out.println("La diferencia en dia es de :" + calculo);
		
	}

}
