package ej01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProducto {

	LinkedList<Producto> lista = new LinkedList<Producto>();

	public int tamanyo() {
		return lista.size();
	}

	public Producto anyadir(Producto p) {
		lista.add(p);
		return p;
	}

	public boolean buscarPosicion1(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return false;
		} else {
			lista.get(pos);
			return true;
		}
	}

	public Producto buscarPosicion2(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return null;
		}
		return lista.get(pos);
	}

	public boolean eliminarPosicion1(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return false;
		} else {
			lista.remove(pos - 1);
			return true;
		}
	}

	public Producto eliminarPosicion2(int pos) {
		if (pos < 1 || pos > tamanyo()) {
			return null;
		}
		return lista.remove(pos - 1);
	}

	public String buscarPorCodigo(int c) {
		String mensaje = "\n" + "Elementos encontrados por el codigo " + c + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == c) {
				mensaje = mensaje + "\n" + lista.get(i) + "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String eliminarPorCodigo(int c) {
		String mensaje = "\n" + "Elementos encontrados por el codigo " + c + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == c) {
				mensaje = mensaje + "\n" + lista.remove(i)
						+ "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public String recuperarPorCodigo(int c) {
		String mensaje = "\n" + "Elementos encontrados por el codigo " + c + ": ";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == c) {
				mensaje = mensaje + "\n" + lista.remove(i)
						+ "\n-----------------------------------------------------";
			}
		}
		return mensaje;
	}

	public boolean cambiarPrecio(int codigo, double precio) {
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getCodigo() == codigo) {
				lista.get(i).setPrecio(precio);
				return true;
			}
		}
		return false;
	}

	public void mostrarLista() {
		Iterator<Producto> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
