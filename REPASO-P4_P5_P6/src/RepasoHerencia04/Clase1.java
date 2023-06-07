package RepasoHerencia04;

// static = Esto significa que todas las instancias comparten el mismo valor de la variable estática.

public abstract class Clase1 {
	private static int cuenta = 0;
	private String s;
	private final int r = 2;

	public Clase1(String s) {
		super();
		this.s = s;
	}

	public static int getCuenta() {
		return cuenta;
	}

	public static void setCuenta(int cuenta) {
		Clase1.cuenta = cuenta;
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
		return "Clase1 [s=" + s + ", r=" + r + "]";
	}
	
	public final void metodoX() {
		System.out.println(r);
	}

}
