package ej02;

public class B {
	private int cuenta;
	private static String cadena;
	private final int r = 2;

	public B() {

	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public static String getCadena() {
		return cadena;
	}

	public static void setCadena(String cadena) {
		B.cadena = cadena;
	}

	public int getR() {
		return r;
	}

	@Override
	public String toString() {
		return "B [cuenta=" + cuenta + ", r=" + r + "]";
	}

	protected void metodoX() {
		System.out.println(r);
	}

}
