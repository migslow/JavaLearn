package ej02;

public class ClaseY extends ClaseB {
	private String t;

	public ClaseY(String s, String t) {
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
		return "t=" + t + super.toString();
	}

}
