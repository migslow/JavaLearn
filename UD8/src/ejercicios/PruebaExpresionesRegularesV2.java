package ejercicios;

public class PruebaExpresionesRegularesV2 {
	
	// * ==> 0 o mas veces
	// + ==> 1 o mas veces
	// ? ==> 0 o 1 vez

	public static void main(String[] args) {
		System.out.println(validarReal("-5.5"));
		System.out.println(validarReal("5.5"));
		System.out.println(validarReal("5,5"));

	}
	
	public static boolean validarReal(String texto) {
		return texto.matches("^-?[0-9]+([\\.,][0-9]+)?");
	}

}
