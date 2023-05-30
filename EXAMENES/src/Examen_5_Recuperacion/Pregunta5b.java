package Examen_5_Recuperacion;



public class Pregunta5b {

	public static void main(String[] args) {
		String patron ="^(Hola|Buenos dias|Buenas tardes)\\s[A-Za-z0-9]{2,15}\\:$";
		String cadena = "Buenos dias Alberto:";
		System.out.println(cadena.matches(patron));

	}

}

