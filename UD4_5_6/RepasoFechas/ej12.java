import java.time.LocalTime;

public class ej12 {

	public static void main(String[] args) {
		LocalTime fechaActual = LocalTime.now();
		LocalTime fechaInsertada = LocalTime.of(12, 30);
		System.out.println("La hora actual es: " + fechaActual.getHour() + ":" + fechaActual.getMinute());
		System.out.println("La hora insertada es: " + fechaInsertada.getHour() + ":" + fechaInsertada.getMinute());
		
		fechaActual = fechaActual.plusMinutes(30);
		System.out.println("La hora actual es: " + fechaActual.getHour() + ":" + fechaActual.getMinute());
		
		System.out.println(fechaActual.isAfter(fechaInsertada));
		fechaActual.
	}

}
