package _05hashset;

import java.util.Objects;

public class Producto {
	private String nombre;
	private int cantidad;

	public Producto(String s, int i) {
		nombre = s;
		cantidad = i;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		Producto other = (Producto) obj;
		return cantidad == other.cantidad && Objects.equals(nombre, other.nombre);
	}

	public String toString() {
		return ("Nombre: " + nombre + " Cantidad: " + cantidad);
	}
}