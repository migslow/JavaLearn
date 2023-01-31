package ej02;

public class X extends B {

	private String v;

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return super.toString() + "X [v=" + v + "]";
	}
	
	public int ganancias() {
		System.out.println();
	}

}
