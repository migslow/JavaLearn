package repasoExpresionesRegulares;

public class ej04 {

	public static void main(String[] args) {
		System.out.println("Validar numeros binarios: ");
		System.out.println(validarNumeroBinario("1010"));
		System.out.println(validarNumeroBinario("10101010"));
		System.out.println(validarNumeroBinario("1080"));
		
		System.out.println("\nValidar numeros octales: ");
		System.out.println(validarNumeroOctal("124"));
		System.out.println(validarNumeroOctal("567"));
		System.out.println(validarNumeroOctal("10812A"));
		
		System.out.println("\nValidar numeros hexadecimales: ");
		System.out.println(validarNumeroHexadecimal("124F"));
		System.out.println(validarNumeroHexadecimal("567A"));
		System.out.println(validarNumeroHexadecimal("108012X1"));
	}

	public static boolean validarNumeroBinario(String texto) {
		return texto.matches("^[1|0]+");
	}
	
	public static boolean validarNumeroOctal(String texto) {
		return texto.matches("^[0-7]+");
	}
	
	public static boolean validarNumeroHexadecimal(String texto) {
		return texto.matches("^[0-9A-F]+");
	}

}
