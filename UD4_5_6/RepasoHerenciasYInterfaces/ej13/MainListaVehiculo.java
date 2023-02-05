package ej13;

public class MainListaVehiculo {
	public static void main(String[] args) {
		ListaVehiculo lista = new ListaVehiculo();

		Vehiculo v1 = new Automovil("BMW", "M5 COMPETITION", 2021, 310, 3, 4);
		Vehiculo v2 = new Camioneta("Ford", "F150 RAPTOR", 2022, 290, 4, 6, 300, true);

		System.out.println("Insertar vehiculos y mostrar informacion: ");
		lista.insertar(v1);
		lista.insertar(v2);
		lista.mostrarInformacion();

		System.out.println("\nAcelerar y frenar la velocidad y mostrar informacion: ");
		v1.acelerar();
		v2.frenar();
		lista.mostrarInformacion();
	}

}
