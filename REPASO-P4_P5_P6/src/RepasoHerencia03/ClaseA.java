package RepasoHerencia03;

public abstract class ClaseA {
	private static int cuenta = 0;
	private String s;
	private final int r = 2;

	public ClaseA(String s) {
		super();
		this.s = s;
	}

	public static int getCuenta() {
		return cuenta;
	}

	public static void setCuenta(int cuenta) {
		ClaseA.cuenta = cuenta;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getR() {
		return r;
	}

	@Override
	public String toString() {
		return "ClaseA [s=" + s + ", r=" + r + "]";
	}

	public final void metodoX() {
		System.out.println(r);
	}

}
