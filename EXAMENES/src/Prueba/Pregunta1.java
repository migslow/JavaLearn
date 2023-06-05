package Prueba;

public class Pregunta1 {

	public static void main(String[] args) {
		int[] tabla = new int[20];
		System.out.print("El contenido del array es: ");
		for (int i = 0; i < tabla.length; i++) { // Genero la tabla con 20 números aleatorios entre 1 y 20
			tabla[i] = (int) ((Math.random() * 20) + 1);
			System.out.print(tabla[i] + " - ");
		}
		System.out.println("\nSon líderes: ");

		for (int i = 0; i < tabla.length - 1; i++) // recorro la tabla desde el primero hasta el penúltimo
		{
			int j;
			for (j = i + 1; j < tabla.length; j++) // Para cada elemento miro si es mayor que todos los de su derecha
			{
				if (tabla[i] <= tabla[j])
					break;
			}
			if (j == tabla.length)
				System.out.print(tabla[i] + " (pos. " + i + ")" + " ");
		}
	}

}
