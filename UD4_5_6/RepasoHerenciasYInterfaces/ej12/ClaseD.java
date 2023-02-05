package ej12;

public abstract class ClaseD {
	private static int total = 0;
	private String a;
	private final int k = 3;

	public ClaseD(String a) {
		super();
		this.a = a;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		ClaseD.total = total;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getK() {
		return k;
	}

	@Override
	public String toString() {
		return "ClaseD [a=" + a + ", k=" + k + "]";
	}
	
	public final void operacionD() {
		System.out.println(k);
	}

}
