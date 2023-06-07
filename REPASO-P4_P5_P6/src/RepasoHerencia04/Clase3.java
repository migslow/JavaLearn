package RepasoHerencia04;

public abstract class Clase3 extends Clase1 {
	private String t;

	public Clase3(String s, String t) {
		super(s);
		this.t = t;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Clase3 [t=" + t + "]";
	}

}
