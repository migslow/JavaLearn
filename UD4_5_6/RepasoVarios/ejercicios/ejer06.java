package ejercicios;

public class ejer06 {

	public static void main(String[] args) {
		String texto = "1-2-3-4-5-6-7-8-9-10";
		texto = texto.replaceFirst("-", "/");
		texto = texto.replaceAll("-", " ");
		String[] numeros = texto.split(" ");

		int suma = 0;
		for (String numero : numeros) {
			suma = suma + Integer.parseInt(numero);
		}
		System.out.println("La suma es: " + suma);
	}

}
