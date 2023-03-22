package ejercicios01;

public class Socio {
	private int Id;
	private String nombre;
	private int estatura;
	private int edad;
	private String localidad;

	public Socio(int id, String nombre, int estatura, int edad, String localidad) {
		super();
		Id = id;
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.localidad = localidad;
	}

	public Socio() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Socio [Id=" + Id + ", nombre=" + nombre + ", estatura=" + estatura + ", edad=" + edad + ", localidad="
				+ localidad + "]";
	}

}
