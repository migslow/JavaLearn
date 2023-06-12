package RepasoHerencia06;

import java.time.LocalTime;

public final class ClaseZ extends ClaseB implements Comparable<ClaseZ>, Saludar {
	private int i;

	public ClaseZ(String s, int i) {
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
		return super.toString() + "ClaseZ [i=" + i + "]";
	}

	@Override
	public int compareTo(ClaseZ o) {
		return i - o.getI();
	}

	@Override
	public void saludo() {
		if (LocalTime.now().getHour() >= 7 && LocalTime.now().getHour() < 14) {
			System.out.println("Buenos dias");
		}
		if (LocalTime.now().getHour() >= 14 && LocalTime.now().getHour() < 20) {
			System.out.println("Buenas tardes");
		}
		if (LocalTime.now().getHour() >= 20 && LocalTime.now().getHour() < 6) {
			System.out.println("Buenas noches");
		}

	}

}
