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

//Borrar cuenta por la POSICI�N en el ARRAY que le paso (Si le paso la 1, se trata de la pos 0 del array...)
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

// de borrarCuentaPorPosicion

	public int buscarPorNumero(long num) { // Busca cuenta por n�mero de cuenta, devuelve la posici�n (-1 si no la
											// encuentra)
// Si la posici�n del array donde la encuentra es la 0, devuelve 1, si es la 1 devuelve 2....
// Recorrer el array para comprobar si existe un n�mero de cuenta que coincide con num
// Si lo encuentra devolver la posici�n+1
// La siguiente l�nea al bucle anterior no se ejecutar� si lo ha encontrado
// Por eso, poner all� return -1 para indicar que si llega all� es porque no lo ha encontrado

		return 11111111; // Cambiar

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
		// Se puede hacer recorriendo el array y utilizando el m�todo equals
		// Si dentro del bucle coincide (equals) la cuenta c con alguna de la lista,
		// devolver cierto
		// La siguiente l�nea al bucle se ejecutar� si no ha encontrado la cuenta,
		// entonces poner all� que
		// devuelva false

		return false; // Cambiar
	} // de ContieneCuenta

	public boolean contieneCuenta2(Cuenta c) {
		// Es muy parecido al anterior pero sin utilizar el m�todo equals, un poco m�s
		// largo
		// Una cuenta coincidir� con la que buscamos si son iguales los 3 atributos...
		// En lugar de usar equals comprobar que coinciden los 3 atributos....
		return false; // Cambiar
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
		// Recorrer toda la lista y por cada cuenta llamar al m�todo imprimeCuenta
		// Basta con un for (int i = 0;.....
	}// de mostrarCuentas

}// de Banco
