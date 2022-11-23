package ejerciciosPaqueteObjetos;

public class Pizza {
	private String tipo;
	private String tamanyo;
	private boolean estado;

	// constructor con los objetos tipo y tamaño
	public Pizza(String tipo, String tamanyo) {
		super();
		this.tipo = tipo;
		this.tamanyo = tamanyo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pizza " + tipo + " " + tamanyo + ", " + estado;
	}

}
