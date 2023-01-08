package FullRepaso;

import java.util.ArrayList;
import java.util.Collections;

import ejerciciosPaquetesColecciones_III.ejercicio1y2.Libro;

public class ArrayListVehiculo {

	ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public void limpiar() {
		lista.clear();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Vehiculo añadir(Vehiculo v) {
		lista.add(v);
		return v;
	}

	public boolean contiene(Libro p) {
		return lista.contains(p);
	}

	public boolean buscarPorPosicion(int pos) {
		if (pos < 1 || pos > tamanyo() || vacia()) {
			return false;
		} else {
			lista.get(pos);
			return true;
		}
	}

	public boolean eliminarPorPosicion(int pos) {
		if (pos < 1 || pos > tamanyo() || vacia()) {
			return false;
		} else {
			lista.remove(pos - 1);
			return true;
		}
	}

	// BUSQUEDAS

	public String buscarPorFabricante(String parte) {
		String mensaje = "\nTodos los vehiculos de la lista buscados por " + parte + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getFabricante().toLowerCase().contains(parte.toLowerCase())
					&& lista.get(i).getFabricante().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String borrarPorFabricante(String parte) {
		String mensaje = "\nTodos los coches que se van a borrar por " + parte + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getFabricante().toLowerCase().contains(parte.toLowerCase())
					&& lista.get(i).getFabricante().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n--------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorNombre(String parte) {
		String mensaje = "\nTodos los vehiculos de la lista buscados por " + parte + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNombre().toLowerCase().contains(parte.toLowerCase())
					&& lista.get(i).getNombre().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String borrarPorNombre(String parte) {
		String mensaje = "\nTodos los coches que se van a borrar por " + parte + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNombre().toLowerCase().contains(parte.toLowerCase())
					&& lista.get(i).getNombre().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n--------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorColor(String parte) {
		String mensaje = "\nTodos los vehiculos de la lista buscados por " + parte + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getColor().toLowerCase().contains(parte.toLowerCase())
					&& lista.get(i).getColor().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String borrarPorColor(String parte) {
		String mensaje = "\nTodos los coches que se van a borrar por " + parte + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getColor().toLowerCase().contains(parte.toLowerCase())
					&& lista.get(i).getColor().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n--------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorKilometros(int kilo) {
		String mensaje = "\nTodos los coches encontrados con el kilometraje " + kilo + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getKilometros() == kilo) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorVelocidad(int velo) {
		String mensaje = "\nTodos los coches encontrados con la velocidad " + velo + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getVelocidadMaxima() == velo) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorNumeroPuertas(int pur) {
		String mensaje = "\nTodos los coches encontrados con el numero de puertas " + pur + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumPuertas() == pur) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorNumeroRuedas(int rue) {
		String mensaje = "\nTodos los coches encontrados con el numero de ruedas " + rue + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNumRuedas() == rue) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorCV(int cv) {
		String mensaje = "\nTodos los coches encontrados con el numero de caballos de potencia " + cv + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCaballosPotencia() == cv) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	// CALCULOS

	public int KilometrosMax() {
		int kiloMax = 0;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getKilometros() > kiloMax) {
				kiloMax = lista.get(i).getKilometros();
			}
		}
		return kiloMax;
	}

	public int KilometrosMedia() {
		int kilometrosTotal = 0, kilometrosMedia = 0;
		for (int i = 0; i < tamanyo(); i++) {
			kilometrosTotal = kilometrosTotal + lista.get(i).getKilometros();
		}
		if (tamanyo() > 0) {
			kilometrosMedia = kilometrosTotal / tamanyo();
		}
		return kilometrosMedia;
	}

	public int velocidadMaxima() {
		int veloMax = 0;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getVelocidadMaxima() > veloMax) {
				veloMax = lista.get(i).getVelocidadMaxima();
			}
		}
		return veloMax;
	}

	public int velocidadMedia() {
		int velocidadTotal = 0, velocidadMedia = 0;
		for (int i = 0; i < tamanyo(); i++) {
			velocidadTotal = velocidadTotal + lista.get(i).getVelocidadMaxima();
		}
		if (tamanyo() > 0) {
			velocidadMedia = velocidadTotal / tamanyo();
		}
		return velocidadMedia;
	}

	public int CVMaximos() {
		int cvMax = 0;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCaballosPotencia() > cvMax) {
				cvMax = lista.get(i).getCaballosPotencia();
			}
		}
		return cvMax;
	}

	public int CVMedia() {
		int cvTotal = 0, cvMedia = 0;
		for (int i = 0; i < tamanyo(); i++) {
			cvTotal = cvTotal + lista.get(i).getCaballosPotencia();
		}
		if (tamanyo() > 0) {
			cvMedia = cvTotal / tamanyo();
		}
		return cvMedia;
	}

	public boolean borrarKilometraje(String fabi, String nom, int km, int numero) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getFabricante() == fabi && lista.get(i).getNombre() == nom
					&& lista.get(i).getKilometros() == km) {
				lista.get(i).setKilometros(lista.get(i).getKilometros() - numero);
				return true;
			}
		}
		return false;
	}

	public boolean aumentarCV(String fabi, String nom, int cv, int numero) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getFabricante() == fabi && lista.get(i).getNombre() == nom
					&& lista.get(i).getCaballosPotencia() == cv) {
				lista.get(i).setCaballosPotencia(lista.get(i).getCaballosPotencia() + numero);
				return true;
			}
		}
		return false;
	}

	public boolean aumentarVelocidad(String fabi, String nom, int velo, int numero) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getFabricante() == fabi && lista.get(i).getNombre() == nom
					&& lista.get(i).getVelocidadMaxima() == velo) {
				lista.get(i).setVelocidadMaxima(lista.get(i).getVelocidadMaxima() + numero);
				return true;
			}
		}
		return false;
	}

	// COMPARACIONES

	public void compararFabricante() {
		Collections.sort(lista, new FabricanteComparator());
		System.out.println("Todos los fabricante ordenados: ");
	}

	public void compararCV() {
		Collections.sort(lista, new CVComparator());
		System.out.println("Todos los coches ordenados por CV: ");
	}

	public void compararVelocidad() {
		Collections.sort(lista, new VelocidadComparator());
		System.out.println("Todos los coches ordenados por su velocidad: ");
	}

	// IMPRIMIR

	public void mostrarTodo() {
		String encontrados = "\n" + tamanyo() + " Elementos de la lista";
		for (int i = 0; i < tamanyo(); i++) {
			encontrados = encontrados + "\n" + lista.get(i) + "\n-----------------------------------------";
		}
		System.out.println(encontrados);
	}

}
