package ejerciciosPaqueteColecciones_I.ejercicios3y4;

public class ListaLibro {
	private final static int MAX = 5;
	private Libro array[];
	private int contador = 0;

	public ListaLibro() {
		array = new Libro[MAX];
	}

	public boolean llena() {
		return contador == MAX;
	}

	public boolean vacia() {
		return contador == 0;
	}

	// numeros de libro que hay en la lista
	public int length() {
		return contador;
	}

	// insertar un libro
	public boolean insertar(Libro p) {
		if (contador == MAX)
			return false;
		array[contador] = p;
		contador++;
		return true;
	}

	// Obtener un libro en una determinado posicion
	public Libro obtenerLibro(int pos) {
		if (pos < 1 || pos > contador) {
			return null;
		}
		return array[pos - 1];
	}

	// eliminar un libro en una determinada posicin
	public boolean eliminarLibro(int pos) {
		if (pos < 1 || pos > contador) {
			return false;
		} else {
			for (int i = pos; i < contador; i++) {
				array[i - 1] = array[i];
				contador--;
			}
			return true;
		}
	}

	// buscar libro distinguiendo de mayusculas y minusculas
	public int buscarLibro(String string) {
		for (int i = 0; i < contador; i++) {
			if (array[i].getTitulo().toUpperCase().contains(string.toUpperCase())
					&& array[i].getTitulo().toLowerCase().contains(string.toLowerCase())) {
				return 1;
			}
		}
		return -1;
	}

	public String toString() {
		String cadena = "Elementos de la lista:\n\n";
		for (int i = 0; i < contador; i++)
			cadena = cadena + array[i].toString() + "\n\n";
		return cadena;
	}
}