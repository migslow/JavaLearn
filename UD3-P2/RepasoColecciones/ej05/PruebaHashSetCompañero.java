package ej05;

public class PruebaHashSetCompañero {

	public static void main(String[] args) {
		HashSetCompañero lista = new HashSetCompañero();
		
		lista.anyadirCompa(new Compañero("Jose"));
		lista.anyadirCompa(new Compañero("Fernando"));
		lista.anyadirCompa(new Compañero("Miguel"));
		lista.anyadirCompa(new Compañero("Luis"));
		lista.anyadirCompa(new Compañero("Jaime"));
		lista.anyadirCompa(new Compañero("Alberto"));
		
		lista.mostrarLista();

	}

}
