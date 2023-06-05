package RepasoHerencia01;

import java.time.LocalTime;

public final class claseZ extends ClaseB implements Comparable<claseZ>, Saludar {
	private int i;

	public claseZ(String s, int i) {
		super(s);
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
		return super.toString() + "claseZ [i=" + i + "]";
	}

	@Override
	public int compareTo(claseZ o) {
		return i - o.getI();
	}

	@Override
	public void saludo() {
		if (LocalTime.now().getHour() >= 7 && LocalTime.now().getHour() <= 14) {
			System.out.println("Buenos dias");
		}
		if (LocalTime.now().getHour() >= 15 && LocalTime.now().getHour() <= 20) {
			System.out.println("Buenos tardes");
		}
		if (LocalTime.now().getHour() >= 21 && LocalTime.now().getHour() <= 6) {
			System.out.println("Buenos noches");
		}
	}

}
