package ej05;

import java.util.Comparator;

public class Piloto extends Persona implements Comparator<PodiosComparator> {

	private String escuderia;
	private int podios;
	private int GranPremio;
	private static int carreras;

	public Piloto(int edad, String nacionalidad, String escuderia, int podios, int granPremio) {
		super(edad, nacionalidad);
		this.escuderia = escuderia;
		this.podios = podios;
		GranPremio = granPremio;
		carreras++;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public int getPodios() {
		return podios;
	}

	public void setPodios(int podios) {
		this.podios = podios;
	}

	public int getGranPremio() {
		return GranPremio;
	}

	public void setGranPremio(int granPremio) {
		GranPremio = granPremio;
	}

	public static int getCarreras() {
		return carreras;
	}

	public static void setCarreras(int carreras) {
		Piloto.carreras = carreras;
	}

	@Override
	public String toString() {
		return super.toString() + "Piloto [escuderia=" + escuderia + ", podios=" + podios + ", GranPremio=" + GranPremio
				+ "]";
	}

	@Override
	public int compare(PodiosComparator o1, PodiosComparator o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
