package RepasoHerencia04;

public abstract class Clase4 extends Clase1{
	private String v;

	public Clase4(String s, String v) {
		super(s);
		this.v = v;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Clase4 [v=" + v + "]";
	}
	
	public abstract double ganancias();
}
