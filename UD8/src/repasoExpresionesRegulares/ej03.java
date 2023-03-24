package repasoExpresionesRegulares;

public class ej03 {

	public static void main(String[] args) {
		System.out.println("Numeros enteros: ");
		System.out.println(validarNumeroEntero("1"));
		System.out.println(validarNumeroEntero("2000"));
		
		System.out.println("\nNumeros enteros positivos: ");
		System.out.println(validarNumeroEnteroPositivo("-1"));
		System.out.println(validarNumeroEnteroPositivo("2000"));
		
		System.out.println("\nNumeros enteros negativos: ");
		System.out.println(validarNumeroEnteroNegativo("-1"));
		System.out.println(validarNumeroEnteroNegativo("2000"));
		
		
		
	}

	public static boolean validarNumeroEntero(String texto) {
		return texto.matches("^-?[0-9]+$");
	}
	
	public static boolean validarNumeroEnteroPositivo(String texto) {
		return texto.matches("^[0-9]+");
	}
	
	public static boolean validarNumeroEnteroNegativo(String texto) {
		return texto.matches("^-[0-9]+");
	}

}
