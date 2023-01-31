package ej02;

public abstract class ClaseB {
	private static int cuenta;
	private String s;
	private static final int r = 2;

	public ClaseB(String s) {
		super();
		this.s = s;
		cuenta++;
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
		return ", s=" + s + ", r=" + r ;
	}
	
	public final void metodoX() {
		System.out.println(r);
	}

}
