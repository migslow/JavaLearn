package RepasoHerencia03;

public class ClaseC extends ClaseA {
	private String t;

	public ClaseC(String s, String t) {
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
		return super.toString() + "ClaseC [t=" + t + "]";
	}

}
