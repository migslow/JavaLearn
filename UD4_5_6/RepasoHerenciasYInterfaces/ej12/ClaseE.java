package ej12;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class ClaseE extends ClaseD implements Comparable<ClaseE>, Saludar {
	private int j;

	public ClaseE(String a, int j) {
		super(a);
		this.j = j;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseE [j=" + j + "]";
	}

	@Override
	public int compareTo(ClaseE o) {
		return j - o.getJ();
	}

	@Override
	public void saludo() {
		if (LocalTime.now().getHour() >= 7 && LocalTime.now().getHour() <= 14) {
			System.out.println("Buenos dias");
		} else if (LocalTime.now().getHour() >= 15 && LocalTime.now().getHour() <= 20) {
			System.out.println("Buenas tardes");
		} else if (LocalTime.now().getHour() >= 21 && LocalTime.now().getHour() <= 6) {
			System.out.println("Buenas noches");
		}
		/*
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.get(Calendar.HOUR) >= 7 && gc.get(Calendar.HOUR) <= 14) {
			System.out.println("Buenos dias");
		}
		if (gc.get(Calendar.HOUR) >= 15 && gc.get(Calendar.HOUR) <= 20) {
			System.out.println("Buenas tardes");
		}
		if (gc.get(Calendar.HOUR) >= 21 && gc.get(Calendar.HOUR) <= 6) {
			System.out.println("Buenas noches");
		}
		*/
	}

}
