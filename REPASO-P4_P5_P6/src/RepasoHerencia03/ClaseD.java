package RepasoHerencia03;

public abstract class ClaseD extends ClaseA {
	private String v;

	public ClaseD(String s, String v) {
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
		return super.toString() + "ClaseD [v=" + v + "]";
	}
	
	public abstract double ganacias();
}
