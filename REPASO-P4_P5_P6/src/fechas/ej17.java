package fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ej17 {

	public static void main(String[] args) {
		LocalDateTime hora = LocalDateTime.now();
		
		System.out.println(hora);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(hora.format(f));

	}

}
