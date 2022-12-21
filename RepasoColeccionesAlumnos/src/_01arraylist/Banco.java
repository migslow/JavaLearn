package _01arraylist;

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
		System.out.println(listaCuentas.add(c));
	}

	public boolean borrarCuenta(Cuenta c) {
		return listaCuentas.remove(c);

	} // de borrarCuenta

	public boolean borrarCuentaPorNumero(long c) { // Borrar cuenta por n�mero de cuenta
		String encontrados = "Cuentas encontradas por el numero: " + c + "\n\n";
		for(int i = 0; i < tamanyo();i++) {
			if(listaCuentas.get(i).getNumero() == c) {
				encontrados = encontrados + listaCuentas.get(i);
				return true;
			}
		}
		// NO HAY PROBLEMA EN NO USAR ITERATOR a la hora de recorrer listaCuentas,
		// PUES EN EL MOMENTO EN QUE LA ENCUENTRO PARO y DEVUELVO TRUE
// La instrucci�n siguiente al bucle anterior se ejecutar� si no ha encontrado la cuenta. Poner all�  return false
		return false;

	}
// de borrarCuentaPorNumero

	public boolean contieneCuenta(Cuenta c) {
		return listaCuentas.contains(c);

	}// de contieneCuenta

	public boolean contieneCuentaMejorado(Cuenta c) {
		// Muy parecido a contieneCuenta2 de la clase Banco del paquete __00arrays
	}
//

	public String buscarPorNombre(String n) {
		// Muy parecido al del paquete __00arrays

	}// de buscarPorNombre

	public void mostrarCuentas() {
		// Id�ntico al del paquete __00arrays
	}// de mostrarCuentas

}// de Banco
