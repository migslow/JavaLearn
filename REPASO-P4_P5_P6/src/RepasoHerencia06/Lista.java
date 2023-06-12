package RepasoHerencia06;

import java.util.ArrayList;

public class Lista {
	private ArrayList<ClaseB> lista = new ArrayList<ClaseB>();
	
	public ClaseB anyadir(ClaseB b) {
		lista.add(b);
		return b;
	}
	
	public int cuentaZ() {
		int cuenta = 0;
		for(ClaseB b : lista) {
			if(b instanceof ClaseZ) {
				cuenta++;
			}
		}
		return cuenta;
	}
	
	public void mostrarLista() {
		for(ClaseB b : lista) {
			System.out.println(b);
		}
	}
}
