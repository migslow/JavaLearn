package ejerciciosPaqueteColecciones_II.ejercicios3y4;

import java.util.LinkedList;

public class LinkedListProducto {

	private LinkedList<Producto> lista = new LinkedList<Producto>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Producto añadirProducto(Producto p) {
		lista.add(p);
		return p;
	}

	public Producto buscarProductoPosicion(int pos) {
		if ((pos < 1) || (pos > lista.size()))
			return null;
		return lista.get(pos);
	}

	public Producto recuperarProductoPosicion(int pos) {
		if ((pos < 1) || (pos > lista.size()))
			return null;
		return lista.get(pos - 1);
	}

	public Producto eliminarProductoPosicion(int pos) {
		if ((pos < 1) || (pos > lista.size()))
			return null;
		return lista.remove(pos - 1);
	}

	public String buscarProductoCodigo(int cod) {
		String encontrados = "Buscando los productos con el codigo " + cod + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == cod) {
				encontrados = encontrados + lista.get(i) + "\n";
			}
		}
		return encontrados;
	}

	public String recuperarProductoCodigo(int cod) {
		String encontrados = "Recuperando los productos con el codigo " + cod;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == cod) {
				encontrados = encontrados + lista.get(i - 1) + "\n";
			}
		}
		return encontrados;
	}

	public String borrarProductoCodigo(int cod) {
		String encontrados = "Eliminando los productos con el codigo " + cod;
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == cod) {
				encontrados = encontrados + lista.remove(i - 1) + "\n";
			}
		}
		return encontrados;
	}

	public String cambiarPrecio(int codigo, double precio) {
		String escrito = "";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == codigo) {
				lista.get(i).setPrecio(precio);
			}
		}
		escrito = "El nuevo precio es " + precio;
		return escrito;
	}

	@Override
	public String toString() {
		String mensaje;
		if (vacia()) {
			return "La lista de esta vacia";
		} else {
			mensaje = tamanyo() + " Productos en la lista: \n-----------------------------------------\n";
			for (int i = 0; i < tamanyo(); i++) {
				mensaje = mensaje + lista.get(i) + "\n";
			}
		}
		return mensaje;
	}
}
