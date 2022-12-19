package _04ordenando;

//Diciembre 2019 - Alberto Carrera
//Repaso colecciones vistas hasta ahora

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Banco {
private ArrayList<Cuenta> listaCuentas;

public Banco() {
 listaCuentas = new ArrayList<Cuenta>();
}

public void annadirCuenta(Cuenta c) {
	  listaCuentas.add(c);
}


public void mostrarCuentas() { 
	  for (int i = 0; i < listaCuentas.size(); i++) 
	      listaCuentas.get(i).imprimeCuenta();
}// de mostrarCuentas


public void ordenacionPorNumero() {
	Collections.sort(listaCuentas); 
}

public void ordenacionPorTitular() {
	// Utilizar método Collections.sort pero como segundo argumento  se emplea un objeto de la clase NombreComparator
}

public void ordenacionPorSaldo() {
	listaCuentas=listaCuentas.stream().sorted((x,y) -> (int) (x.getSaldo()-y.getSaldo())).collect(Collectors.toCollection(ArrayList::new));
}

}// de Banco
