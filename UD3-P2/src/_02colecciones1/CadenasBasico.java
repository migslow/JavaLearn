package _02colecciones1;

public class CadenasBasico {

	public static void main(String[] args) {
		String nombre1 = "Alberto Carrera";
		String nombre2 = "Belén Carrera";
		String nombre3 = "Luis Aldea";
		System.out.println(nombre1.length()); // =15 caracteres
		System.out.println(nombre1.toLowerCase());
		System.out.println(nombre2.toUpperCase());
		System.out.println(nombre1.compareTo(nombre2)); // IMPORTANTE PARA ORDENAR
		// Negativo si nombre1 < nombre2, 0 si iguales, Positivo si nombre1 > nombre2
		System.out.println(nombre1.contains("carrera")); // false
		System.out.println(nombre1.contains("Carrera")); // true
		System.out.println(nombre1.toLowerCase().contains("carrera")); // true
		System.out.println(nombre3.equals("LUIS ALDEA"));// false
		System.out.println(nombre3.equalsIgnoreCase("LUIS ALDEA")); // true
		System.out.println(nombre1.compareToIgnoreCase("aLBErto cArrERA")); // =0
	}

}
