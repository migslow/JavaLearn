package RepasoHerencia05;

import java.util.LinkedList;

public class Lista {
	private LinkedList<Producto> lista = new LinkedList<Producto>();

	public Producto insertar(Producto p) {
		lista.add(p);
		return p;
	}

	public int cuentaTelefono(String marca) {
		int cuenta = 0;
		for (Producto p : lista) {
			if (p instanceof Telefono) {
				if (((Telefono) p).getMarca().equalsIgnoreCase(marca)) {
					cuenta++;
				}
			}
		}
		return cuenta;
	}

	public void mostrarLista() {
		for (Producto p : lista) {
			System.out.println(p);
		}
	}
}
