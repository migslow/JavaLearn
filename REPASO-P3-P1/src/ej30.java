
public class ej30 {

	public static void main(String[] args) {
		int[] tabla = new int[20];
		System.out.print("El contenido del array es: ");
		for (int i = 0; i < tabla.length; i++) { // Genero la tabla con 20 números aleatorios entre 1 y 20
			tabla[i] = (int) ((Math.random() * 20) + 1);
			System.out.print(tabla[i] + " - ");
		}
		System.out.println("\nSon líderes: ");

		for (int i = 0; i < tabla.length; i++) {
            boolean esLider = true;
            for (int j = i + 1; j < tabla.length; j++) {
                if (tabla[i] <= tabla[j]) {
                    esLider = false;
                    break;
                }
            }
            if (esLider) {
                System.out.print(tabla[i] + " (pos. " + i + ")" + " ");
            }
        }

	}

}
