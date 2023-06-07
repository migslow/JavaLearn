package RepasoHerencia04;

import java.time.LocalTime;

public final class Clase2 extends Clase1 implements Comparable<Clase2>, Saludar {
	private int i;

	public Clase2(String s, int i) {
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
		return "Clase2 [i=" + i + "]";
	}

	@Override
	public int compareTo(Clase2 o) {
		return i - o.getI();
	}

	@Override
	public void saludo() {
		if (LocalTime.now().getHour() >= 7 && LocalTime.now().getHour() >= 14) {
			System.out.println("Buenos dias");
		}
		if (LocalTime.now().getHour() >= 15 && LocalTime.now().getHour() >= 20) {
			System.out.println("Buenas tardes");
		}
		if (LocalTime.now().getHour() >= 21 && LocalTime.now().getHour() >= 6) {
			System.out.println("Buenas noches");
		}

	}

}
