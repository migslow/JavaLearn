package _02colecciones1;

// Lista.java: una lista de Personas

public class Lista {
	private final static int MAX = 100;
	private Persona _array[];
	private int _cont = 0; // Indica la primera posici�n libre
	// del array. Igual al n�mero de elementos

	public Lista() {
		_array = new Persona[MAX];
	}

	public boolean llena() {
		return _cont == MAX;
	}

	public boolean vacia() {
		return _cont == 0;
	}

	public int length() {
		return _cont;
	}

	public boolean insertar(Persona p) {
		// Devuelve true si se inserta; false si lista llena
		if (_cont == MAX)
			return false;
		_array[_cont] = p;
		_cont++;
		return true;
	}

	public Persona recuperar(int pos) {
		// true si tiene �xito; false si posici�n no v�lida
		// pos variar� de 1 al n�mero de elementos
		if ((pos <= 0) || (pos >= _cont))
			return null;
		return _array[pos];
	}

	public boolean insertarOrden(Persona p) {
		if (_cont == MAX) {
			return false;
		}
		int i = 0;
		boolean encontrado = false;
		while ((i < _cont) && (!encontrado)) {
			encontrado = (_array[i].dameApellidos().compareToIgnoreCase(p.dameApellidos()) > 0);
		}
		if (!encontrado) {
			i++;
		}
		for (int j = _cont - 1; j >= i; j--) {
			_array[j + 1] = _array[j];
		}
		_array[i] = p;
		_cont++;
		return true;
	}

	public boolean borrarPersonaPosicion(int pos) {
		if ((pos < 1) || (pos > _cont) || (_cont == 0)) {
			return false;
		}
		for (int i = pos; i < _cont; i++) {
			_cont--;
		}
		return true;
	}

	public String toString() {
		String cad = "Elementos de la lista:\n\n";
		for (int i = 0; i < _cont; i++)
			cad = cad + _array[i].toString() + "\n";
		return cad;
	}
}