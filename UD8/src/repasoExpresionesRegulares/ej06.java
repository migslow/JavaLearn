package repasoExpresionesRegulares;

public class ej06 {

	public static void main(String[] args) {
		System.out.println("Validar matricula: ");
		System.out.println(validarMatricula("1111AAA"));
		System.out.println(validarMatricula("1111AAAA"));

	}
	
	public static boolean validarMatricula(String texto) {
		return texto.matches("^[0-9]{4}[A-Z]{3}$");
	}

}
