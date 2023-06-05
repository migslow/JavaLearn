package RepasoHerencia02;

public abstract class ClaseX extends ClaseB {
	private String v;

	public ClaseX(String s, String v) {
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
		return "ClaseX [v=" + v + "]";
	}
	
	public abstract int ganancias();

}
