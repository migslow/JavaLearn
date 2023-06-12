package serializacion02;

import java.io.Serializable;

public class Articulo implements Serializable {
	private int codigo;
	private String nombre;
	private int cantidad;
	private double precio;

	public Articulo(int codigo, String nombre, int cantidad, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ "]";
	}

}
