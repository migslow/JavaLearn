package ejercicios;

public class ej03b {

	public static void main(String[] args) {
		String nombreCompleto = "Miguel Ovejero Piedrafita";
		
		String[] cadena = nombreCompleto.split(" ");
		
		for (String nombre : cadena) {
            System.out.println(nombre);
        }

	}

}
