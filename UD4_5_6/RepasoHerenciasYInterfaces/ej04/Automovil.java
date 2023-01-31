package ej04;

public class Automovil extends Vehiculo {
	private String tipoCombustible;
	private int puertas;

	public Automovil() {
		super();
	}

	public Automovil(String marca, String modelo, int numeroRuedas, String tipoCombustible, int puertas) {
		super(marca, modelo, numeroRuedas);
		this.tipoCombustible = tipoCombustible;
		this.puertas = puertas;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + tipoCombustible + ", " + puertas;
	}

}
