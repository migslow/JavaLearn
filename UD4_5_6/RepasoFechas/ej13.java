import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ej13 {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		Date fechaActual = new Date();
		System.out.println("La fecha actual es: " + fechaActual);
		imprimirFecha();
	}
	
	public static void imprimirFecha() throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat();
		System.out.println("Introduce la fecha ( DD/MM/YYYY HH:MM:SS )");
		String fecha = s.nextLine();
		
		Date fechaActual = formato.parse(fecha);
		
		System.out.println("La fecha actual es: " + fechaActual);
	}
}
