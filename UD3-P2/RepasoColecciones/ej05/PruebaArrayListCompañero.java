package ej05;

public class PruebaArrayListCompañero {

	public static void main(String[] args) {
		ArrayListCompañero lista = new ArrayListCompañero();
		
		lista.anyadirCompa(new Compañero("Jose"));
		lista.anyadirCompa(new Compañero("Fernando"));
		lista.anyadirCompa(new Compañero("Miguel"));
		lista.anyadirCompa(new Compañero("Luis"));
		lista.anyadirCompa(new Compañero("Jaime"));
		lista.anyadirCompa(new Compañero("Alberto"));
		
		lista.mostrarLista();

	}

}
