package ej16;

public class Producto {

	private String nombre;
	private int cantidad;

	public Producto(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return cantidad;
	}

	public void setPrecio(double precio) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto: " + nombre + "\nCantidad: " + cantidad;
	}

}
