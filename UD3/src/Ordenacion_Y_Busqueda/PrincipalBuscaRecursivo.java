package Ordenacion_Y_Busqueda;

//B�squeda binaria. El vector debe estar ordenado.
public class PrincipalBuscaRecursivo {

	public static void main(String[] args) {
		int numero = 77, resultado;
		// https://www.juegosonce.es/resultados-superonce-06-noviembre-2016
		int[] superonce = { 5, 9, 15, 24, 26, 30, 34, 36, 37, 42, 47, 55, 56, 58, 63, 67, 70, 71, 73, 78 };
		resultado = Busca.buscaBinariaRecursiva(superonce, 0, superonce.length - 1, numero);
		if (resultado != -1)
			System.out.println(
					"El numero " + numero + " aparecio y ocupa la posicion " + resultado + " (comenzando en la 0)");
		else
			System.out.println("El numero " + numero + " no salio premiado ");

	}

}
