package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 * En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000 en las áreas de frutas, verduras y abarrotes. 
 * ¿ Cual sera el total que pagara una persona por su compra ?, se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar.
 */

public class ej07 {

	static Scanner s = new Scanner(System.in);

	public static void compraProducto() {
		int cantidad, cantidadPrecio, totalPrecio;
		double precio;
		System.out.println("Introduce el nombre del producto: ");
		String nProducto = s.next();
		System.out.println("Introduce el precio del producto: ");
		int precioProducto = s.nextInt();
		System.out.println("Introduce la cantidad de ese producto: ");
		int cProducto = s.nextInt();
		cantidadPrecio = precioProducto * cProducto;
		if (cantidadPrecio > 1000) {
			System.out.println("El precio de la compra con el descuento es: " + cantidadPrecio * 0.20 + "€");
		} else {
			System.out.println("No hay descuento, el precio seria de: " + cantidadPrecio + "€");
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del cliente: ");
		String nombre = s.next();
		System.out.println("Introduce el producto: (Fruta, verdura o abarrote) ");
		String p = s.next();
		switch (p) {
		case "fruta":
		case "Fruta":
			compraProducto();
			break;
		case "verduras":
		case "Verduras":
			compraProducto();
			break;
		case "abarrotes":
		case "Abarrotes":
			compraProducto();
			break;
		default:
			System.out.println("No has introducido alguna fruta, verdura o abarrotes");
		}

	}

}
