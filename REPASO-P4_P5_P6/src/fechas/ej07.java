package fechas;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ej07 {

	public static void main(String[] args) {
		Date fecha1 = new Date(116, 3, 18);
		System.out.println("La fecha es: " + fecha1);
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String fechaFormateada = f.format(fecha1);
		System.out.println("La fecha formateada es: " + fechaFormateada);

	}

}
