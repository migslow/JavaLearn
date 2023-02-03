package ejercicios;

public class ejer03 {

	public static void main(String[] args) {
		String texto = "Anillo,Bolsa,Calculadora,Documento,Estuche";
		String[] items = texto.split(",");

		for (String item : items) {
			System.out.println(item);
		}
	}

}
