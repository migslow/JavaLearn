package RepasoComparatorYComparable;
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
	public boolean equals(Object obj) {
		Caballo other = (Caballo) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(velocidad) == Double.doubleToLongBits(other.velocidad);
	}

	@Override
	public String toString() {
		return nombre + ", edad = " + edad + ", velocidad = " + velocidad;
	}
}
