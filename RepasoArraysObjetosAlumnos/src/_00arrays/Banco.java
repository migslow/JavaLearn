package _00arrays;

//Diciembre 2019 -  Alberto Carrera

//Repaso colecciones 

public class Banco {
	private static final int MAX = 100;
	private Cuenta[] listaCuentas;
	private int contador = 0;

	public Banco() {
		listaCuentas = new Cuenta[MAX];
	}

	public int tamanyo() {
		return contador;
	}

	public boolean annadirCuenta(Cuenta c) {
		if (contador == MAX) {
			return false;
		}
		listaCuentas[contador] = c;
		contador++;
		return true;
	}

	public boolean borrarCuentaPorPosicion(int pos) {
		if (pos < 1 || pos > contador) {
			return false;
		}
		for (int i = pos; i < contador; i++) {
			listaCuentas[i - 1] = listaCuentas[i];
			contador--;
		}
		return true;
	}

	public int buscarPorNumero(long num) {
		int cont = 0;
		for (int i = 0; i < contador; i++) {
			if (listaCuentas[i].getNumero() == num) {
				listaCuentas[i + 1] = listaCuentas[i];
				contador++;
				return 1;
			}
		}
// Busca cuenta por n�mero de cuenta, devuelve la posici�n (-1 si no la encuentra)
// Si la posici�n del array donde la encuentra es la 0, devuelve 1, si es la 1 devuelve 2....
// Recorrer el array para comprobar si existe un n�mero de cuenta que coincide con num
// Si lo encuentra devolver la posici�n+1
// La siguiente l�nea al bucle anterior no se ejecutar� si lo ha encontrado
// Por eso, poner all� return -1 para indicar que si llega all� es porque no lo ha encontrado

		return -1;

	}// de buscarPorNumero

	public boolean borrarCuentaPorNumero(long num) { // Borrar cuenta por el n�mero de cuenta
		// Llamar al m�todo buscarPorNumero anterior
		// Si la llamada al m�todo anterior devuelve -1 entonces devolver false pues no
		// existe dicha cuenta a borrar
		// Sino se puede devolver una llamada al m�todo borrarCuentaPorPosicion
		// pas�ndole como argumento la posici�n que
		// nos ha devuelto el m�todo buscarPorNumero

		return false; // Cambiar
	}
// de borrarCuentaPorNumero

	public boolean contieneCuenta(Cuenta c) {
		for (int i = 0; i < contador; i++) {
			if(listaCuentas[i].equals(c)) {
				return true;
			}
		}
		return false;
	}

	public boolean contieneCuenta2(Cuenta c) {
		for (int i = 0; i < contador; i++) {
			if(listaCuentas[i].getNombre() == c) {
				return true;
			}
		}
		return false;
	}
//

	public String buscarPorNombre(String n) {
		// Declarar al principio una cadena vac�a donde dejar los resultados
		// Recorrer toda la lista, extraer el nombre de cada cuenta, si dicho nombre
		// contiene la cadena n
		// entonces a�adir (concatenar) dicha cuenta con todos sus datos al resultado...
		// Para comprobar si la contiene o no
		// convertir a may�sculas las dos cadenas a comprobar...
		// Despu�s del bucle, antes de terminar devolver esa cadena resultado que
		// contendr� los resultados encontrados que se han ido concatenando

		return "1111111111"; // Cambiar
	}// de buscarPorNombre

	public void mostrarCuentas() {
		for (int i = 0; i < contador; i++) {
			listaCuentas[i].imprimeCuenta();
			System.out.print("\n");
		}
	}

}// de Banco
