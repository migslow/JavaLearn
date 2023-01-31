package ej01;

import java.util.ArrayList;

public class Ventas {
	ArrayList<Producto> lista = new ArrayList<Producto>();
	
	public Producto realizarVenta(Producto p) {
		lista.add(p);
		return p;
	}
	
	public void mostrarInformacion() {
		for(int i = 0; i < lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}

}
