package remplaceAll;

public class ej03 {

	public static void main(String[] args) {
		String frase = "Hoy\\.es\\.sabado";
		String cadena = frase.replaceAll("\\.", "  ");
		System.out.println(cadena);
	}

}
