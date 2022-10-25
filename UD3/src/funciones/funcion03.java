package funciones;

import java.time.LocalDateTime;

public class funcion03 {

	public static void reloj(String nombre) {
		System.out.println("Hola " + nombre + "son las: ");
		System.out.println(LocalDateTime.now().getHour());
	} // de reloj

	public static void main(String[] args) {
		// funciones de Usuario 3, con argumentos y sin devolucion.
		reloj("Miguel");
		System.out.println("Fin");
	} // de main

} // de clase
