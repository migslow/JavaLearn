package ejerciciosPaqueteColecciones_II.ejercicios1y2;

import java.util.Stack;

public class StackPalabras {
	private Stack<String> pila = new Stack<String>();

	public boolean pilaVacia() {
		return pila.isEmpty();
	}

	public void apilarPalabra(String palabra) {
		// pila.push(palabra);
		// pila.addElement(palabra);
		pila.add(palabra);
	}

	public String desapilarPalabra() {
		// return pila.pop();
		return pila.remove(pila.size() - 1);
	}

	public String obtenerPalabraCima() {
		// return pila.lastElement();
		// return pila.peek();
		return pila.get(pila.size() - 1);
	}

	@Override
	public String toString() {
		return pila + "";
	}
	
	
}
