package FullRepaso;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetVehiculo {

	HashSet<Vehiculo> lista = new HashSet<Vehiculo>();

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

	public boolean contiene(Vehiculo p) {
		return lista.contains(p);
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
		for (Vehiculo v : lista) {
			if (v.getFabricante().toLowerCase().contains(parte.toLowerCase())) {
				mensaje = mensaje + "\n" + v + "\n--------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String borrarPorFabricante(String parte) {
		String mensaje = "\nTodos los coches que se van a borrar por " + parte + ": ";
		for (Vehiculo v : lista) {
			if (v.getFabricante().toLowerCase().contains(parte.toLowerCase())
					&& v.getFabricante().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + v + "\n--------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorNombre(String parte) {
		String mensaje = "\nTodos los vehiculos de la lista buscados por " + parte + ": ";
		for (Vehiculo v : lista) {
			if (v.getNombre().toLowerCase().contains(parte.toLowerCase())
					&& v.getNombre().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + v + "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String borrarPorNombre(String parte) {
		String mensaje = "\nTodos los coches que se van a borrar por " + parte + ": ";
		for (Vehiculo v : lista) {
			if (v.getNombre().toLowerCase().contains(parte.toLowerCase())
					&& v.getNombre().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + v + "\n--------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorColor(String parte) {
		String mensaje = "\nTodos los vehiculos de la lista buscados por " + parte + ": ";
		for (Vehiculo v : lista) {
			if (v.getColor().toLowerCase().contains(parte.toLowerCase())
					&& v.getColor().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + v + "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String borrarPorColor(String parte) {
		String mensaje = "\nTodos los coches que se van a borrar por " + parte + ": ";
		for (Vehiculo v : lista) {
			if (v.getColor().toLowerCase().contains(parte.toLowerCase())
					&& v.getColor().toUpperCase().contains(parte.toUpperCase())) {
				mensaje = mensaje + "\n" + v + "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorKilometros(int kilo) {
		String mensaje = "\nTodos los coches encontrados con el kilometraje " + kilo + ": ";
		for (Vehiculo v : lista) {
			if (v.getKilometros() == kilo) {
				mensaje = mensaje + "\n" + v + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorVelocidad(int velo) {
		String mensaje = "\nTodos los coches encontrados con la velocidad " + velo + ": ";
		for (Vehiculo v : lista) {
			if (v.getVelocidadMaxima() == velo) {
				mensaje = mensaje + "\n" + v + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorNumeroPuertas(int pur) {
		String mensaje = "\nTodos los coches encontrados con el numero de puertas " + pur + ": ";
		for (Vehiculo v : lista) {
			if (v.getNumPuertas() == pur) {
				mensaje = mensaje + "\n" + v + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorNumeroRuedas(int rue) {
		String mensaje = "\nTodos los coches encontrados con el numero de ruedas " + rue + ": ";
		for (Vehiculo v : lista) {
			if (v.getNumRuedas() == rue) {
				mensaje = mensaje + "\n" + v + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String buscarPorCV(int cv) {
		String mensaje = "\nTodos los coches encontrados con el numero de caballos de potencia " + cv + ": ";
		for (Vehiculo v : lista) {
			if (v.getCaballosPotencia() == cv) {
				mensaje = mensaje + "\n" + v + "\n---------------------------------------------------------";
			}
		}
		return mensaje;
	}

	// CALCULOS

	public int KilometrosMax() {
		int kiloMax = 0;
		for (Vehiculo v : lista) {
			if (v.getKilometros() > kiloMax) {
				kiloMax = v.getKilometros();
			}
		}
		return kiloMax;
	}

	public int KilometrosMedia() {
		int kilometrosTotal = 0, kilometrosMedia = 0;
		for (Vehiculo v : lista) {
			kilometrosTotal = kilometrosTotal + v.getKilometros();
		}
		if (tamanyo() > 0) {
			kilometrosMedia = kilometrosTotal / tamanyo();
		}
		return kilometrosMedia;
	}

	public int velocidadMaxima() {
		int veloMax = 0;
		for (Vehiculo v : lista) {
			if (v.getVelocidadMaxima() > veloMax) {
				veloMax = v.getVelocidadMaxima();
			}
		}
		return veloMax;
	}

	public int velocidadMedia() {
		int velocidadTotal = 0, velocidadMedia = 0;
		for (Vehiculo v : lista) {
			velocidadTotal = velocidadTotal + v.getVelocidadMaxima();
		}
		if (tamanyo() > 0) {
			velocidadMedia = velocidadTotal / tamanyo();
		}
		return velocidadMedia;
	}

	public int CVMaximos() {
		int cvMax = 0;
		for (Vehiculo v : lista) {
			if (v.getCaballosPotencia() > cvMax) {
				cvMax = v.getCaballosPotencia();
			}
		}
		return cvMax;
	}

	public int CVMedia() {
		int cvTotal = 0, cvMedia = 0;
		for (Vehiculo v : lista) {
			cvTotal = cvTotal + v.getCaballosPotencia();
		}
		if (tamanyo() > 0) {
			cvMedia = cvTotal / tamanyo();
		}
		return cvMedia;
	}

	public boolean borrarKilometraje(String fabi, String nom, int km, int numero) {
		for (Vehiculo v : lista) {
			if (v.getFabricante() == fabi && v.getNombre() == nom && v.getKilometros() == km) {
				v.setKilometros(v.getKilometros() - numero);
				return true;
			}
		}
		return false;
	}

	public boolean aumentarCV(String fabi, String nom, int cv, int numero) {
		for (Vehiculo v : lista) {
			if (v.getFabricante() == fabi && v.getNombre() == nom
					&& v.getCaballosPotencia() == cv) {
				v.setCaballosPotencia(v.getCaballosPotencia() + numero);
				return true;
			}
		}
		return false;
	}

	public boolean aumentarVelocidad(String fabi, String nom, int velo, int numero) {
		for (Vehiculo v : lista) {
			if (v.getFabricante() == fabi && v.getNombre() == nom
					&& v.getVelocidadMaxima() == velo) {
				v.setVelocidadMaxima(v.getVelocidadMaxima() + numero);
				return true;
			}
		}
		return false;
	}

	// COMPARACIONES
	/*
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
	*/
	/*
	 * public void ordenacionNatural() { Collections.sort(null); }
	 */

	// IMPRIMIR

	public void mostrarTodo() {
		String encontrados = "\n" + tamanyo() + " Elementos de la lista";
		for (Vehiculo v : lista) {
			encontrados = encontrados + "\n" + v + "\n-----------------------------------------";
		}
		System.out.println(encontrados);
	}

	public void mostrarIterator() {
		Iterator<Vehiculo> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
