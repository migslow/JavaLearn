package repasoExpresionesRegulares;

public class ej02 {

	public static void main(String[] args) {
		System.out.println(validarNombre("Miguel Ovejero"));
		System.out.println(validarNombre("miguel Ovejero"));
		System.out.println(validarNombre("MiguelOvejero"));
		System.out.println(validarNombre("Miguel Ovejero Perez"));

	}

	public static boolean validarNombre(String nombre) {
		return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,3}");
	}

}
