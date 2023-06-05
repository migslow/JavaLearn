package RepasoHerencia01;

public abstract class claseX {

	private String v;

	public claseX(String v) {
		super();
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
		return super.toString() + "claseX [v=" + v + "]";
	}
	
	public abstract int ganacias();

}
