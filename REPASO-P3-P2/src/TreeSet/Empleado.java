package TreeSet;

public class Empleado {
	private int id;
	private String nombre;
	private String oficio;
	private double salario;

	public Empleado(int id, String nombre, String oficio, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.oficio = oficio;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", oficio=" + oficio + ", salario=" + salario + "]";
	}

}
