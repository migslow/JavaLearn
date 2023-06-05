package ej03;

public class Tienda implements Comparable<Tienda>{
	private int idArticulo;
	private String nombre;
	private int cantidad;
	private double precio;

	public Tienda(int idArticulo, String nombre, int cantidad_, double precio) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.cantidad = cantidad_;
		this.precio = precio;
	}

	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
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

	public void setCantidad(int cantidad_) {
		this.cantidad = cantidad_;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tienda [idArticulo=" + idArticulo + ", nombre=" + nombre + ", cantidad_=" + cantidad + ", precio="
				+ precio + "]";
	}

	@Override
	public int compareTo(Tienda o) {
		return this.getNombre().compareToIgnoreCase(o.getNombre());
		// Si fuera entero: 
		// return Integer.compare(this.valor, otro.getValor());
	}

}
