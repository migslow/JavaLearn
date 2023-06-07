package remplaceAll;

public class ej02 {
	public static void main(String[] args) {
		String frase = "Hola.buenas.noches";
		String cadena = frase.replaceAll("\\.", ",");
		System.out.println(cadena);
	}
}
