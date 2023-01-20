package funciones;

import java.time.LocalDateTime;

public class funcion06 {

	public static int reloj() {
		return LocalDateTime.now().getHour();

	} // de reloj

	public static void main(String[] args) {
		// funciones de Usuario 5, version corta.
		reloj();
		System.out.println("Son las " + reloj() + " horas");
		System.out.println("Fin");
	} // de main

} // de clase
