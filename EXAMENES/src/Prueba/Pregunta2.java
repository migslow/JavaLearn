package Prueba;

import java.util.LinkedList;

public class Pregunta2 {

	private LinkedList<Codigo> lista = new LinkedList<Codigo>();

	public boolean agregarProducto(Codigo p) {
		for (Codigo c : lista) {
			if (c.getCodigo() == -1) {
				lista.add(p);
				return true;
			}
		}
		return false;
	}

	public int buscarPorCodigo(int codigo) {
		for (Codigo c : lista) {
			if (c.getCodigo() == codigo) {
				return c.getCodigo();
			}
		}
		return -1;
	}

	public void buscarProductoPorNombre(String nombre) {
		for (Codigo c : lista) {
			if (c.getNombre().toLowerCase().contains(nombre.toLowerCase())
					&& c.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
				System.out.println(c);
			}
		}
	}

}
