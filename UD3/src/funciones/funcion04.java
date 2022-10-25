package funciones;

import java.time.LocalDateTime;

public class funcion04 {

	public static void reloj(String nombre, String apellidos) {
		System.out.println("Hola " + nombre + " " + apellidos + " son las: ");
		System.out.println(LocalDateTime.now().getHour());
	} // de reloj

	public static void main(String[] args) {
		// funciones de Usuario 4, con varios argumentos y sin devolucion.
		reloj("Miguel", "Ovejero Piedrafita");
		System.out.println("Fin");
	} // de main

} // de clase
