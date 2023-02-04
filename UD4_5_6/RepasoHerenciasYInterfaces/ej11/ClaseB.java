package ej11;

public abstract class ClaseB {
	private static int cuenta = 0;
	private String s;
	private final static int r = 2;

	public ClaseB(String s) {
		super();
		this.s = s;
	}

	public static int getCuenta() {
		return cuenta;
	}

	public static void setCuenta(int cuenta) {
		ClaseB.cuenta = cuenta;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public static int getR() {
		return r;
	}

	@Override
	public String toString() {
		return "ClaseB [s=" + s + "]";
	}
	
	public final void metodoX() {
		System.out.println(r);
	}

}
