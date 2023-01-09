package ejercicios;

public class ej04 {

	public static void main(String[] args) {
		String cadena = "Miguel Ovejero Piedrafita";
		String buscar = "Piedrafita";
		String remplazar = "Ovejero";
		String change = cadena.replaceAll(buscar, remplazar);
		System.out.println(change);

	}

}
