package ej12;

public abstract class ClaseG extends ClaseD {

	private String c;

	public ClaseG(String a) {
		super(a);
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseG [c=" + c + "]";
	}

	public abstract void ingresos();

}
