package funciones;

import java.time.LocalDateTime;

public class funcion05 {

	public static int reloj() {
		int reloj = (LocalDateTime.now().getHour());
		return reloj;

	} // de reloj

	public static void main(String[] args) {
		// funciones de Usuario 5, sin argumentos y con devolucion.
		int reloj = reloj();
		System.out.println("Son las " + reloj + " horas");
		System.out.println("Fin");
	} // de main

} // de clase
