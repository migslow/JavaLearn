package ejercicios;

public class ejer04 {

	public static void main(String[] args) {
		String texto = "Perro:Gato:Rana:Pájaro:Pez";
		String[] objetos = texto.split(":");

		for (String o : objetos) {
			System.out.println(o);
		}
	}

}
