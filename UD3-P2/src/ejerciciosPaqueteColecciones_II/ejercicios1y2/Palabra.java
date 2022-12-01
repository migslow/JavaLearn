package ejerciciosPaqueteColecciones_II.ejercicios1y2;

public class Palabra {
	private String palabra;

	public Palabra(String palabra) {
		super();
		this.palabra = palabra;
	}

	public String damePalabra() {
		return palabra;
	}

	public void ponPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public String toString() {
		return "Palabra [palabra=" + palabra + "]";
	}

}
