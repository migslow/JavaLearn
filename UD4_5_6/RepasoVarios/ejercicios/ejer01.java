package ejercicios;

public class ejer01 {
	public static void main(String[] args) {
		String texto = "Hola mundo, ¿Como estas hoy?";
		
		texto = texto.replace("mundo", "Java");
		texto = texto.replaceAll("hoy", "mañana");
		
		System.out.println(texto);
	}
}
