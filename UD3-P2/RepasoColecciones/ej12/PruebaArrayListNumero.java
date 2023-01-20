package ej12;

public class PruebaArrayListNumero {

	public static void main(String[] args) {
		ArrayListNumero lista = new ArrayListNumero();
		
		lista.crearNumero(new Numero(5));
		lista.crearNumero(new Numero(10));
		lista.crearNumero(new Numero(15));
		lista.crearNumero(new Numero(20));
		lista.crearNumero(new Numero(25));
		
		lista.mostrarLista();
		
		lista.suma();
		lista.media();
		lista.maximo();
		lista.minimo();
		

	}

}
