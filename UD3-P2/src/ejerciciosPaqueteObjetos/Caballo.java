package ejerciciosPaqueteObjetos;

import _01objetos.Cuenta;
import _01objetos.Gato;

public class Caballo {
	private String nombre;
	private int edad;
	private double altura;
	private String color;
	private int velocidad;
	private String raza;
	private int peso;

	public Caballo(String nombre, int edad, double altura, String color, int velocidad, String raza, int peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.color = color;
		this.velocidad = velocidad;
		this.raza = raza;
		this.peso = peso;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void relincha() {
		System.out.println("¡hiiii, hiiii, hiiii!");
	}
	
	

	public void CorreCon(Caballo contrincante) {
		if (this.raza.equals("Caballo comun")) {
			System.out.println("No esta permitido. La carrera tiene que ser con caballos pura sangre");
		} else {
			if (contrincante.getRaza().equals("Caballo comun")) {
				System.out.println("No puedes entrar en la carrera");
			} else {
				System.out.println("Haber si eres lo suficiente como para superarme");
			}
		}
	}
	
	public boolean velocidad(Caballo contrincante, double cantidad) {
		if (velocidad(contrincante, cantidad) > cantidad) {
			System.out.println("No es tan rapido");
		} else if(velocidad(contrincante, cantidad) == cantidad){
			System.out.println("Tienen la misma velocidad");
		} else {
			System.out.println("Es mas rapido que su contrincante");
		}
	}
	
	public boolean transferencia(Cuenta destino, double cantidad) {
		boolean resultadoTransferencia = true;
		if (reintegro(cantidad))
			destino.ingreso(cantidad);
		else
			resultadoTransferencia = false;

		return resultadoTransferencia;
	}

	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", color=" + color
				+ ", velocidad=" + velocidad + ", raza=" + raza + ", peso=" + peso + "]";
	}

}
