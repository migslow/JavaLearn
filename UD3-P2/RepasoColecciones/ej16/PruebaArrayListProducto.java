package ej16;

import java.util.Scanner;

public class PruebaArrayListProducto {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayListProducto lista = new ArrayListProducto();
		// avena 	garbanzos 	tomate		jengibre 	quinoa 		guisantes
		// 2,21 	2,39 		1,59 		3,13 		4,50 		1,60
		
		System.out.println("Introduce un producto: (Avena, Garbanzos, Tomate, Jengibre, Quinoa, Guisantes): ");
		String p = s.next();
		System.out.println("Introduce la cantidad del producto: ");
		int c = s.nextInt();
		
		System.out.println(lista.crearProducto(new Producto(p, c)));
		System.out.println(lista.crearProducto(new Producto(p, c)));
		System.out.println(lista.crearProducto(new Producto(p, c)));
		System.out.println(lista.crearProducto(new Producto(p, c)));

	}

}
