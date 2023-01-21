package ej16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProducto {
	
	static Scanner s = new Scanner(System.in);

	ArrayList<Producto> lista = new ArrayList<Producto>();
	
	public Producto crearProducto(Producto p) {
		lista.add(p);
		return p;
	}
}
