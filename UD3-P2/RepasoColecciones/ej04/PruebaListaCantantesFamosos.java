package ej04;

public class PruebaListaCantantesFamosos {

	public static void main(String[] args) {
		ListaCantantesFamosos lista = new ListaCantantesFamosos();
		
		lista.anyadir(new CantanteFamoso("Sakira", "Waka waka"));
		
		lista.mostrarIterator();

	}

}
