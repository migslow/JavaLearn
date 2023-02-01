package ej07;

public class Main {

	public static void main(String[] args) {
		ListaVehiculo lista = new ListaVehiculo();
		Vehiculo v1 = new Coche(50, "Negro");
		Vehiculo v2 = new Bicicleta("Roja", "Orbea");
		Vehiculo v3 = new Moto(false, "Verde");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
