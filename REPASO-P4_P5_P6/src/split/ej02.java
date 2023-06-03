package split;

public class ej02 {

	public static void main(String[] args) {
		String frase = "Hola como estas, hoy en dia eso ya no se ve";
		String[] partes = frase.split(" ");
		for (int i = 0; i < partes.length; i++) {
			System.out.println(partes[i]);
		}
		

	}

}
