package RepasoHerencia05;

public class Telefono extends Producto {
	private String marca;

	public Telefono(String nombre, double precio, String marca) {
		super(nombre, precio);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return super.toString() + "Telefono [marca=" + marca + "]";
	}

}
