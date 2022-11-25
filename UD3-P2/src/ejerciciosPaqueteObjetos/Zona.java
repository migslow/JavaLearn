package ejerciciosPaqueteObjetos;

public class Zona {
	private int entradasPorVender;

	public Zona(int n) {
		super();
		this.entradasPorVender = n;
	}
	
	public void comprobarEntratadas(int n) {
		if(this.entradasPorVender == 0) {
			System.out.println("Lo sentimos, no hay entradas");
		}
	}

	public void vender(int n) {
		if (this.entradasPorVender == 0) {
			System.out.println("Lo siento, las entradas para esa zona están agotadas.");
		} else if (this.entradasPorVender < n) {
			System.out.println("Solo quedan " + this.entradasPorVender + " entradas para esa zona.");
		}
		if (this.entradasPorVender >= n) {
			entradasPorVender = entradasPorVender - n;
			System.out.println("Aqui tiene sus " + n + " entradas, gracias.");
		}
	}

}
