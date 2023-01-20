package _00arrays;

//Diciembre 2019 -  Alberto Carrera

//Repaso colecciones 

public class Banco {
	private static final int MAX = 100;
	private Cuenta[] listaCuentas = new Cuenta[MAX];;
	private int contador = 0;

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
		if (pos < 1 || pos > tamanyo() || pos == 0) {
			return false;
		}
		for (int i = pos; i < tamanyo(); i++) {
			listaCuentas[i - 1] = listaCuentas[i];
			contador--;
		}
		return true;
	}

	public int buscarPorNumero(long num) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas[i].getNumero() == num) {
				listaCuentas[i + 1] = listaCuentas[i];
				System.out.println(listaCuentas[i].getNombre());
				return 1;
			}
		}
		return -1;
	}

	public boolean borrarCuentaPorNumero(long num) {
		if (buscarPorNumero(num) == -1) {
			return false;
		} else {
			for (int i = 0; i < tamanyo(); i++) {
				if (listaCuentas[i].getNumero() == num) {
					listaCuentas[i] = listaCuentas[i - 1];
					System.out.println(listaCuentas[i].getNumero());
				}
			}
		}
		return true;
	}

	public boolean contieneCuenta(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas[i].equals(c)) {
				return true;
			}
		}
		return false;
	}

	public boolean contieneCuenta2(Cuenta c) {
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas[i].equals(c)) {
				return true;
			}
		}
		return false;
	}

	public String buscarPorNombre(String n) {
		String encontrados = "Todas las cuentas encontradas por " + n + ": " + "\n\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (listaCuentas[i].getNombre().toLowerCase().contains(n.toLowerCase())) {
				encontrados = encontrados + listaCuentas[i] + "\n-----------------------------------------------\n";
			}
		}
		return encontrados;
	}

	public void mostrarCuentas() {
		for (int i = 0; i < tamanyo(); i++) {
			listaCuentas[i].imprimeCuenta();
		}
	}

}// de Banco