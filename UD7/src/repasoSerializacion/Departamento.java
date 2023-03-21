package repasoSerializacion;

import java.io.Serializable;

public class Departamento implements Serializable {
	private int numeroID;
	private String nombre;
	private int numeroEmpleados;
	private String ubicacion;
	private double presupuestoAnual;

	public Departamento(int numeroID, String nombre, int numeroEmpleados, String ubicacion, double presupuestoAnual) {
		super();
		this.numeroID = numeroID;
		this.nombre = nombre;
		this.numeroEmpleados = numeroEmpleados;
		this.ubicacion = ubicacion;
		this.presupuestoAnual = presupuestoAnual;
	}

	public int getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getPresupuestoAnual() {
		return presupuestoAnual;
	}

	public void setPresupuestoAnual(double presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}

	@Override
	public String toString() {
		return "Departamento [numeroID=" + numeroID + ", nombre=" + nombre + ", numeroEmpleados=" + numeroEmpleados
				+ ", ubicacion=" + ubicacion + ", presupuestoAnual=" + presupuestoAnual + "]";
	}

}
