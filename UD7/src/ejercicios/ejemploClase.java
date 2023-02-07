package ejercicios;

public class ejemploClase {

	public static void main(String[] args) {
		if (args.length >= 2) {
			System.out.println("Primer argumento: " + args[0]);
			System.out.println("\nSegundo argumento: " + args[1]);
		} else {
			System.out.println("No he recibido los argumentos");
			System.exit(-1);
		}

	}

}
