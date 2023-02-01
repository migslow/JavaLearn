package ej06;

public class Tecnico extends Operario{
	private String trabajo;
	private int horasTrabajadas;
	public Tecnico(String nombre, String trabajo, int horasTrabajadas) {
		super(nombre);
		this.trabajo = trabajo;
		this.horasTrabajadas = horasTrabajadas;
	}
	public String getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	@Override
	public String toString() {
		return super.toString() + ", Tecnico: " + trabajo + ", horasTrabajadas: " + horasTrabajadas;
	}}
