package ej08;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia lista = new ListaMultimedia();

		Multimedia m1 = new Disco("Thiller", "Michael Jackson", "MP4", 3.20, "Pop");
		Multimedia m2 = new Disco("Back in black", "AC/DC", "MP4", 3.42, "Rock");
		Multimedia m3 = new Disco("Como si fuera a morir mañana", "Leiva", "MP4", 4.04, "pop");
		Multimedia m4 = new Pelicula("Pelicula1", "Autor1", "MP4", 209.56, "Actor1", "Actriz1");
		Multimedia m5 = new Pelicula("Pelicula2", "Autor2", "MP4", 189.56, "Actor2", "Actriz2");
		Multimedia m6 = new Pelicula("Pelicula3", "Autor3", "MP4", 192.56, "Actor3", null);

		lista.crearObjeto(m1);
		lista.crearObjeto(m2);
		lista.crearObjeto(m3);
		lista.crearObjeto(m4);
		lista.crearObjeto(m5);
		lista.crearObjeto(m6);

		lista.mostrarInformacion();
		System.out.println(lista.duracionTotal());
		System.out.println(lista.generoTotal("Pop"));
		System.out.println(lista.cuantasNoActriz());

	}

}
