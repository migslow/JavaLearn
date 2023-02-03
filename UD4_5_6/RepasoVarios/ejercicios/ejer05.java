package ejercicios;

public class ejer05 {

	public static void main(String[] args) {
		String texto = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
		String resultado = "";
		String[] letras = texto.split(" ");
		
		
		for (int i = 0; i < letras.length; i++) {
			if (i % 2 == 0) {
				resultado = resultado + letras[i].toLowerCase();
			} else {
				resultado = resultado + letras[i].toUpperCase();
			}
		}
		
		System.out.println(resultado);

	}

}
