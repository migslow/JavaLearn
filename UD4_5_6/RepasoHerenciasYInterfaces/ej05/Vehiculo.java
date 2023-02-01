package ej05;

public class Vehiculo extends Piloto {
	private String constructores;
	private String provedoresMotor;
	private int cv;

	public Vehiculo(int edad, String nacionalidad, String escuderia, int podios, int granPremio, String constructores,
			String provedoresMotor, int cv) {
		super(edad, nacionalidad, escuderia, podios, granPremio);
		this.constructores = constructores;
		this.provedoresMotor = provedoresMotor;
		this.cv = cv;
	}

	public String getConstructores() {
		return constructores;
	}

	public void setConstructores(String constructores) {
		this.constructores = constructores;
	}

	public String getProvedoresMotor() {
		return provedoresMotor;
	}

	public void setProvedoresMotor(String provedoresMotor) {
		this.provedoresMotor = provedoresMotor;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return super.toString() + "Vehiculo [constructores=" + constructores + ", provedoresMotor=" + provedoresMotor
				+ ", cv=" + cv + "]";
	}

}
