package ejerciciosPaqueteColecciones_II.ejercicios1y2;

public class MainStackPalabras {

	public static void main(String[] args) {
		StackPalabras sp = new StackPalabras();
		System.out.println("Comprobar si la pila esta vacia");
		System.out.println(sp.pilaVacia());
		sp.apilarPalabra("Hola");
		sp.apilarPalabra("Buenos");
		sp.apilarPalabra("Dias");
		sp.apilarPalabra("Que");
		sp.apilarPalabra("Tal");
		System.out.println("Comprobar si la pila esta vacia");
		System.out.println(sp.pilaVacia());
		System.out.println(sp);
	}

}
