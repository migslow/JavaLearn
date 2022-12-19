package _04ordenando_colecciones;

public class Usuario1 implements Comparable<Usuario1> {
	private String nombre;
	private int edad;

	Usuario1(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String toString() {
		return nombre + " (" + edad + ")";
	}

	@Override
	public int compareTo(Usuario1 o) {
		// return this.edad - o.getEdad();
		return nombre.compareToIgnoreCase(o.getNombre());
	}
}