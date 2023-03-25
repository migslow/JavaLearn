package repasoExpresionesRegulares;

public class ej05 {

	public static void main(String[] args) {
		System.out.println("Validar un real: ");
		System.out.println(validarReal("-13.5"));
		System.out.println(validarReal("13,58"));
		System.out.println(validarReal("13,5878"));
		System.out.println(validarReal(".5"));
		System.out.println(validarReal(",5"));
		System.out.println(validarReal("135"));

		System.out.println("\nValidar real positivo: ");
		System.out.println(validarRealPositivo("-13.5"));
		System.out.println(validarRealPositivo("13,5"));
		System.out.println(validarRealPositivo(".5"));
		System.out.println(validarRealPositivo(",5"));
		System.out.println(validarRealPositivo("135"));

		System.out.println("\nValidar real negativo: ");
		System.out.println(validarRealNegativo("-13.5"));
		System.out.println(validarRealNegativo("13,5"));
		System.out.println(validarRealNegativo(".5"));
		System.out.println(validarRealNegativo(",5"));
		System.out.println(validarRealNegativo("135"));

	}

	public static boolean validarReal(String texto) {
		return texto.matches("^-?[0-9]+([\\.,][0-9]{1,2})?");

	}

	public static boolean validarRealPositivo(String texto) {
		return texto.matches("^[0-9]+([\\.,][0-9]+)?");

	}

	public static boolean validarRealNegativo(String texto) {
		return texto.matches("^-[0-9]+([\\.,][0-9]+)?");

	}

}
