package RepasoHerencia04;

import java.util.LinkedList;

public class Lista {
	private LinkedList<Clase1> lista = new LinkedList<Clase1>();

	public Clase1 insertar(Clase1 c) {
		lista.add(c);
		return c;
	}
	
	public int cuentaClase2() {
		int cuenta = 0;
		for(Clase1 c : lista) {
			if(c instanceof Clase2) {
				cuenta++;
			}
		}
		return cuenta;
	}

	public void mostrarLista() {
		for (Clase1 c : lista) {
			System.out.println(c);
		}
	}
}
