package ejerciciosPaqueteColecciones_I.ejercicios3y4;

public class ListaLibro {
	private static final int MAX = 15;
	private Libro[] libros;
	private int contador;

	public ListaLibro() {
		libros = new Libro[MAX];
		contador = 0;
	}

	public int numeroLibros() {
		return contador;
	}

	public boolean agregaLibro(Libro l) {
		if (contador == MAX) {
			return false;
		}
		libros[contador] = l;
		contador++;
		return true;
	}

	public Cancion dameCancion(int pos) {
		if (pos < 1 || pos > contador) {
			return null;
		}
		return libros[pos - 1];
	}

	public boolean grabarCancion(int pos, Cancion c) {
		if (pos < 1 || pos > contador) {
			return false;
		} else {
			libros[pos - 1] = c;
			return true;
		}
	}

	public boolean eliminarLibro(int pos) {
		if (pos < 1 || pos > contador) {
			return false;
		} else {
			for (int i = pos; i < contador; i++) {
				libros[i - 1] = libros[i];
				contador--;
			}
			return true;
		}
	}

	@Override
	public String toString() {
		String cadena = "\nElementos de la lista:\n\n";
		for (int i = 0; i < contador; i++) {
			cadena = cadena + libros[i].dameTitulo() + " - " + libros[i].dameAutor() + "\n";
		}
		return cadena;
	}
}
