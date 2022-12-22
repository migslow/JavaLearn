import java.util.Objects;

public class Caballo {
	private String nombre;
	private int edad;
	private double velocidad;

	public Caballo() {
		super();
	}

	public Caballo(String nombre, int edad, double velocidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.velocidad = velocidad;
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

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", edad=" + edad + ", velocidad=" + velocidad + "]";
	}
}
