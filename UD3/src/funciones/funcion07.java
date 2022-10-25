package funciones;

public class funcion07 {

	public static double conversorCelsius(double gradosF) {
		double resultado = 5.0 / 9 * (gradosF - 32);
		return resultado;

	} // de conversor

	public static void main(String[] args) {
		// funciones de Usuario 6, con argumento y devolucion.
		double grafosFahrenheit = 35.7;
		double r = conversorCelsius(grafosFahrenheit);
		System.out.println("La conversion: " + r);
		System.out.println("Fin");
	} // de main

} // de clase
