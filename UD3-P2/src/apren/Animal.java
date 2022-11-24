package apren;

public class Animal {
	private String nombre;
	private int numeroPatas;
	private int edad;
	private String continente;
	private String especie;
	private boolean sangreCaliente;

	public Animal(String nombre, int numeroPatas, int edad, String continente, String especie, boolean sangreCaliente) {
		super();
		this.nombre = nombre;
		this.numeroPatas = numeroPatas;
		this.edad = edad;
		this.continente = continente;
		this.especie = especie;
		this.sangreCaliente = sangreCaliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isSangreCaliente() {
		return sangreCaliente;
	}

	public void setSangreCaliente(boolean sangreCaliente) {
		this.sangreCaliente = sangreCaliente;
	}

	public void compitePatas(Animal competicion) {
		if (this.numeroPatas == competicion.numeroPatas) {
			System.out.println("Tienen las mismas patas. Es un empate");
		} else if (this.numeroPatas > competicion.numeroPatas) {
			System.out.println("El primer animal tiene mas patas que el segundo");
		} else {
			System.out.println("El segundo animal tiene mas patas que el primero");
		}
	}

	public void compiteEdad(Animal competicion) {
		if (this.edad == competicion.edad) {
			System.out.println("Tienen la misma edad. Es un empate");
		} else if (this.numeroPatas > competicion.numeroPatas) {
			System.out.println("El primer animal es mas mayor que el segundo");
		} else {
			System.out.println("El segundo animal es mas mayor que el primero");
		}
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", numeroPatas=" + numeroPatas + ", edad=" + edad + ", continente="
				+ continente + ", especie=" + especie + ", sangreCaliente=" + sangreCaliente + "]";
	}

}
