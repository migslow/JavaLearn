package ej22;

public class Main {

	public static void main(String[] args) {
		TreeSetLibro biblioteca = new TreeSetLibro();

        biblioteca.crearLibro(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954));
        biblioteca.crearLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997));
        biblioteca.crearLibro(new Libro("El gran Gatsby", "F. Scott Fitzgerald", 1925));
        biblioteca.crearLibro(new Libro("Matar a un ruiseñor", "Harper Lee", 1960));
        
        biblioteca.mostrarLista();
	}

}
