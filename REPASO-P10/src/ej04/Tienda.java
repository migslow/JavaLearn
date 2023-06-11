package ej04;

public class Tienda {
	private int id;
	private String articulo;
	private double precio;
	private int cantidad;

	public Tienda() {
		super();
	}

	public Tienda(int id, String articulo, double precio, int cantidad) {
		super();
		this.id = id;
		this.articulo = articulo;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Tienda [id=" + id + ", articulo=" + articulo + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

}
