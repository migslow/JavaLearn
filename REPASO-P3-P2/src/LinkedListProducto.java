

import java.util.LinkedList;

public class LinkedListProducto {

	private LinkedList<Producto> lista = new LinkedList<Producto>();

	public int tamanyo() {
		return lista.size();
	}

	public boolean anyadir(Producto p) {
		return lista.add(p);
	}

	public Producto buscarProducto(int pos) {
		if ((pos < 1) || (pos > lista.size())) {
			return null;
		}
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
	
	public String buscarPorProducto(int cod) {
		String encontrados = "Productos encontrados por: " + cod;
		for (int i = 0; i < tamanyo(); i++) {
			if(lista.get(i).getCodigo() == cod) {
				encontrados = encontrados + lista.get(i) + "\n";
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
		return lista + "\n";
	}

}
