package _03arraylist_equals;

//Diciembre 2019 - Alberto Carrera
//Repaso colecciones vistas hasta ahora

import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
	private ArrayList<Cuenta> listaCuentas;

	public Banco() {
		listaCuentas = new ArrayList<Cuenta>();
	}

	public int tamanyo() {
		return listaCuentas.size();

	}

	public void annadirCuenta(Cuenta c) {
		listaCuentas.add(c);
	}

	public boolean borrarCuenta(Cuenta c) {
		for(int i = 0; i< tamanyo();i++) {
			if(listaCuentas.get(i).equals(c)) {
				listaCuentas.remove(c);
				return true;
			}
		}
		return false;

	} // de borrarCuenta
	

	public boolean borrarCuentaPorNumero(long c) { // Borrar cuenta por n�mero
		String mensaje = "Las cuenta " + c + " ha sido elimiando";
		for(int i = 0; i< tamanyo();i++) {
			if(listaCuentas.get(i).getNumero() == c) {
				mensaje = mensaje + listaCuentas.get(i);
			}
		}
		return true;


	}
// de borrarCuentaPorNumero

	public boolean contieneCuenta(Cuenta c) {
		listaCuentas.contains(c);
		return true;
		
	}// de contieneCuenta
/*
	public boolean contieneCuentaMejorado(Cuenta c) {
		//
	}
	*/
//

	public String buscarPorNombre(String n) {
		String mensaje = "Todos los nombre encontados por " + n + ": ";
		for(int i = 0; i < tamanyo();i++) {
			if(listaCuentas.get(i).getNombre().toLowerCase().contains(n.toLowerCase())) {
				mensaje = mensaje + listaCuentas.get(i);
			}
		}
		return mensaje;
	}// de buscarPorNombre

	public void mostrarCuentas() {
		String mensaje = tamanyo() + " Elementos en la lista\n";
		for(int i = 0;i < tamanyo();i++) {
			mensaje = mensaje + listaCuentas.get(i) + "\n";
		}
		System.out.println(mensaje);
	}// de mostrarCuentas

}// de Banco
