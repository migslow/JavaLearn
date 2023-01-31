package ej02;

public class Y extends B {
	private String t;

	public Y(int cuenta, String t) {
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
		return super.toString() + "Y [t=" + t + "]";
	}

}
