package Examen_4;

public abstract class Empleado {
	private String nombre;
	private int edad;
	private double salarioBase;
	protected final int plus = 50;

	public Empleado(String nombre, int edad, double salarioBase) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getPlus() {
		return plus;
	}

	@Override
	public String toString() {
		return nombre + ", edad=" + edad + ", salarioBase=" + salarioBase;
	}

	public double salarioTotal() {
		return salarioTotal();
	}

}
