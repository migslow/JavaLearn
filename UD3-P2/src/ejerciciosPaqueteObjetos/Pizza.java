package ejerciciosPaqueteObjetos;

public class Pizza {
	private String tipo;
	private String tamanyo;
	private String estado;
	private static int TotalPedidas = 0;
	private static int TotalServidas = 0;

	public Pizza(String tamanyo, String tipo) {
		this.tamanyo = tamanyo;
		this.tipo = tipo;
		this.estado = "pedida";
		TotalPedidas++;
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

	public String isEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static int getTotalPedidas() {
		return TotalPedidas;
	}

	public void setTotalPedidas(int totalPedidas) {
		TotalPedidas = totalPedidas;
	}

	public static int getTotalServidas() {
		return TotalServidas;
	}

	public void setTotalServidas(int totalServidas) {
		TotalServidas = totalServidas;
	}

	public void sirve() {
		if (estado == "pedida") {
			estado = "servida";
			TotalServidas++;
		} else
			System.out.println("esa pizza ya se ha servido");
	}

	@Override
	public String toString() {
		return "Pizza " + tipo + " " + tamanyo + ", " + estado;
	}

}
