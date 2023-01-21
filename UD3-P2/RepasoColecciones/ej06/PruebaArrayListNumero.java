package ej06;

public class PruebaArrayListNumero {

	public static void main(String[] args) {
		ArrayListNumero lista = new ArrayListNumero();

		lista.anyadirNumero();
		System.out.println("La lista tiene un tamaño de: " + lista.tamanyo());
		System.out.println();
		System.out.println("La suma de los numeros es: " + lista.suma());
		System.out.println("La media de los numeros es: " + lista.media());
		lista.maxMin();
	}

}
