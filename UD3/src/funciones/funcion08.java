package funciones;

public class funcion08 {

	public static double conversorCelsius(double gradosF) {
		return 5.0 / 9 * (gradosF - 32);

	} // de conversor

	public static void main(String[] args) {
		// funciones de Usuario 6, version corta.
		System.out.println("La conversion: " + conversorCelsius(35.7));
		System.out.println("Fin");
	} // de main

} // de clase
