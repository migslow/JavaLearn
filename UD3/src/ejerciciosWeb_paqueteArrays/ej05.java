package ejerciciosWeb_paqueteArrays;

public class ej05 {

	public static void main(String[] args) {
		String[] paises = new String[4];
		paises[0] = "España";
		paises[1] = "Francia";
		paises[2] = "Estados Unidos";
		paises[3] = "Alemania";

		for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + (i + 1) + ": " + paises[i]);
		}
	}

}
