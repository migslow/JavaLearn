package ej12;

public class ClaseF extends ClaseD {
	private String b;

	public ClaseF(String a, String b) {
		super(a);
		this.b = b;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseF [b=" + b + "]";
	}

}
