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
	//Devolver el tamaño de listaCuentas
}

public void annadirCuenta(Cuenta c) {
	  // método add
}

public boolean borrarCuenta(Cuenta c) {
	return listaCuentas.remove(c);
	
	
} // de borrarCuenta

public boolean borrarCuentaPorNumero(long c) { // Borrar cuenta por número de cuenta
 // NO HAY PROBLEMA EN NO USAR ITERATOR a la hora de recorrer listaCuentas, 
 //PUES EN EL MOMENTO EN QUE LA ENCUENTRO PARO y DEVUELVO TRUE
// La instrucción siguiente al bucle anterior se ejecutará si no ha encontrado la cuenta. Poner allí  return false


}
// de borrarCuentaPorNumero

public boolean contieneCuenta(Cuenta c) {
	return listaCuentas.contains(c);
	
}// de contieneCuenta

public boolean contieneCuentaMejorado(Cuenta c) {
	//Muy parecido a contieneCuenta2 de la clase Banco del paquete __00arrays
}
//

public String buscarPorNombre (String n) {
	 // Muy parecido al del paquete __00arrays
	
}// de buscarPorNombre


public void mostrarCuentas() { 
	  // Idéntico al del paquete __00arrays
}// de mostrarCuentas


}// de Banco
