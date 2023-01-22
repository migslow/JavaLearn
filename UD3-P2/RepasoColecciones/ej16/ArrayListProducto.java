package ej16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProducto {

	static Scanner s = new Scanner(System.in);

	ArrayList<String> lista = new ArrayList<String>();

	public void crearProducto() {
		int num = 0;
		do {

			System.out.println("Introduce un producto: (Avena, Garbanzos, Tomate, Jengibre, Quinoa, Guisantes): ");
			String nombreProducto = s.next();
			System.out.println("Introduce la cantidad del producto: ");
			int cantidad = s.nextInt();
			lista.add(cantidad, nombreProducto);
			System.out.println(lista);
		} while (num != 0);
	}

	public void mostrarLista() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Producto Precio Cantidad Subtotal");
			System.out.println("\n--------------------------------");
			System.out.println();
		}
	}
}
