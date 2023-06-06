package RepasoHerencia03;

import java.time.LocalTime;

public final class ClaseB extends ClaseA implements Comparable<ClaseB>, Saludar {
	private int i;

	public ClaseB(String s, int i) {
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
		return super.toString() + "ClaseB [i=" + i + "]";
	}

	@Override
	public int compareTo(ClaseB o) {
		return i - o.getI();
	}

	@Override
	public void salido() {
		if (LocalTime.now().getHour() >= 7 && LocalTime.now().getHour() <= 14) {
			System.out.println("Buenos dias");
		}
		if (LocalTime.now().getHour() >= 15 && LocalTime.now().getHour() <= 20) {
			System.out.println("Buenas tardes");
		}
		if (LocalTime.now().getHour() >= 21 && LocalTime.now().getHour() <= 6) {
			System.out.println("Buenas noches");
		}

	}

}
