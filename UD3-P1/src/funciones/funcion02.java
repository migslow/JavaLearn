package funciones;

import java.time.LocalDateTime;

public class funcion02 {

	public static void reloj() {
		System.out.println("Hoy es: " + LocalDateTime.now());
		System.out.println("La hora es: " + LocalDateTime.now().getHour());
	} // de reloj

	public static void main(String[] args) {
		// funciones de Usuario 1, sin argumentos y sin devolucion.

		reloj();
		System.out.println("Fin");
	} // de main

} // de clase
