package ej13;

import java.util.ArrayList;

public class ListaVehiculo {
	ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

	public void insertar(Vehiculo v) {
		lista.add(v);
	}

	public void mostrarInformacion() {
		for (Vehiculo v : lista) {
			System.out.println(v);
		}
	}
}
