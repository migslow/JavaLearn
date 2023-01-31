package ej02;

public class Z extends B implements Comparable<Z>, Saludar{

	private int i;

	public Z(int cuenta, int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return super.toString() + "Z [i=" + i + "]";
	}

	@Override
	public int compareTo(Z o) {
		return i - o.getI();
	}

	@Override
	public void saludar() {
		
		
	}
	
	

}
