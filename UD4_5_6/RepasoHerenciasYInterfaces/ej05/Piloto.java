package ej05;

public class Piloto extends Persona {

	private String escuderia;
	private static int podios;
	private static int GranPremio;
	private static int pilotos;

	public Piloto(String nombre, String apellido, int edad, String nacionalidad, String escuderia, int podios,
			int granPremio) {
		super(nombre, apellido, edad, nacionalidad);
		this.escuderia = escuderia;
		this.podios = podios;
		GranPremio = granPremio;
		pilotos++;
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

	public static int getPilotos() {
		return pilotos;
	}

	public static void setPilotos(int pilotos) {
		Piloto.pilotos = pilotos;
	}

	@Override
	public String toString() {
		return super.toString() + "Piloto [escuderia=" + escuderia + ", podios=" + podios + ", GranPremio=" + GranPremio
				+ "]";
	}

}
