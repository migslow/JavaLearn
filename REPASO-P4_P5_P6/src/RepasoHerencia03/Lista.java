package RepasoHerencia03;

import java.util.ArrayList;

public class Lista {
	private ArrayList<ClaseA> lista = new ArrayList<ClaseA>();
	
	public ClaseA anyadir(ClaseA a) {
		lista.add(a);
		return a;
	}
	
	public int cuentaB() {
		int cuenta = 0;
		for(ClaseA a : lista) {
			if(a instanceof ClaseB) {
				cuenta++;
			}
		}
		return cuenta;
	}
	
	public void mostrarLista() {
		for(ClaseA a: lista) {
			System.out.println(a);
		}
	}
}
