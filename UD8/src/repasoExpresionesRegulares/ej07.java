package repasoExpresionesRegulares;

public class ej07 {

	public static void main(String[] args) {
		System.out.println("Validar IPs: ");
		System.out.println(validarIP("192.168.3.1"));
		System.out.println(validarIP("92.168.3.1"));
		System.out.println(validarIP("1922.168.3.1"));
		System.out.println(validarIP("192168.1"));

		System.out.println("\nValidar ISBN: ");
	}

	public static boolean validarIP(String texto) {
		return texto.matches("^([0-9]{1,3})(\\.)([0-9]{1,3})(\\.)([0-9]{1,3})(\\.)([0-9]{1,3})$");

	}

	public static boolean validarISBN(String texto) {
		return texto.matches("^(978|979)[0-9]{13}$");
	}

}
