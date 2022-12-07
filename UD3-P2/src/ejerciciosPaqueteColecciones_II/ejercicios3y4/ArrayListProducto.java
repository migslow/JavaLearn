package ejerciciosPaqueteColecciones_II.ejercicios3y4;

import java.util.ArrayList;

import _03colecciones2.Libro;

public class ArrayListProducto {

	private ArrayList<Producto> lista = new ArrayList<Producto>();

	public int tamanyoLista() {
		return lista.size();
	}

	public ArrayList<Producto> imprimirLista() {
		for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista);
        }
		return lista;
	}

	public Producto añadirALaLista(Producto p) {
		lista.add(p);
		return p;
	}
	
	public Producto recuperarProducto(int pos) {
		if ((pos < 1) || (pos > lista.size()))
			return null;
		return lista.get(pos - 1);
	}
	
	public boolean buscarProductoPosicion(int pos) {
		if ((pos < 1) || (pos > _cont) || (_cont == 0)) {
			return false;
		}
		for (int i = pos; i < _cont; i++) {
			_cont--;
		}
		return true;
	}
	
	public int eliminarProducto(int pos) {
		
	}
}
