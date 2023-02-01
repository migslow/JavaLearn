package ej06;

public abstract class Construccion {
	private static String nombreEmpresa;
	private static int NumEdificios = 0;

	public Construccion() {

	}

	public Construccion(String nombreEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		NumEdificios++;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public static int getNumEdificios() {
		return NumEdificios;
	}

	public static void setNumEdificios(int numEdificios) {
		NumEdificios = numEdificios;
	}

	@Override
	public String toString() {
		return nombreEmpresa;
	}

}
