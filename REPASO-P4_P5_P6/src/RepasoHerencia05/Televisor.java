package RepasoHerencia05;

public class Televisor extends Producto {
	private int pulgadas;

	public Televisor(String nombre, double precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisor [pulgadas=" + pulgadas + "]";
	}

}
