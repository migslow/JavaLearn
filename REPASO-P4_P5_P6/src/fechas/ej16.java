package fechas;

import java.time.LocalTime;

public class ej16 {

	public static void main(String[] args) {
		LocalTime tiempo1 = LocalTime.now();
		LocalTime tiempo2 = LocalTime.of(9, 49);

		System.out.println(tiempo1.isAfter(tiempo2));
		System.out.println(tiempo1.isBefore(tiempo2));
		
		System.out.println(tiempo1.compareTo(tiempo2));
	}

}
