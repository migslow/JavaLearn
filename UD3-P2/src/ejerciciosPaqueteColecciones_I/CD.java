package ejerciciosPaqueteColecciones_I;

class CD {
	private String canciones[];

	public CD(String[] canciones) {
		super();
		this.canciones = canciones;
	}

	public void numeroCanciones() {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("vector : " + canciones[i] + " indice : " + i);
		}
	}
}
