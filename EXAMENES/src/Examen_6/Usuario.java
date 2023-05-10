package Examen_6;


public class Usuario {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String telefono;
	private int registro;
	//
	public Usuario() {
	}
	//
	public Usuario(String nombre, String apellidos, String dni, String telefono, int registro) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
		this.registro = registro;
	}
	//
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDni() {
		return dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public int getRegistro() {
		return registro;
	}
	//
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono
				+ ", registro=" + registro + "]";
	}
	
	
} // de la clase Usuario
