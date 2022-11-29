package ejerciciosPaqueteColecciones_I;

import _02colecciones1.Persona;

class CD {
	private static final int MAX = 15;
	private Cancion[] canciones;
	private int contador;

	public CD() {
		canciones = new Cancion[MAX];
		contador = 0;
	}

	public int numeroConciones() {
		return contador;
	}

	public boolean agregaCancion(Cancion c) {
		if (contador == MAX) {
			return false;
		}
		canciones[contador] = c;
		contador++;
		return true;
	}

	public Cancion dameCancion(int pos) {
		if (pos < 1 || pos > contador) {
			return null;
		}
		return canciones[pos - 1];
	}

	public boolean grabarCancion(int pos, Cancion c) {
		if (pos < 1 || pos > contador) {
			return false;
		} else {
			canciones[pos - 1] = c;
			return true;
		}
	}

	public boolean eliminarCancion(int pos) {
		if (pos < 1 || pos > contador) {
			return false;
		} else {
			for (int i = pos; i < contador; i++) {
				canciones[i - 1] = canciones[i];
				contador--;
			}
			return true;
		}
	}

	@Override
	public String toString() {
		String cadena = "\nElementos de la lista:\n\n";
		for (int i = 0; i < contador; i++) {
			cadena = cadena + canciones[i].dameTitulo() + " - " + canciones[i].dameAutor() + "\n";
		}
		return cadena;
	}

}
