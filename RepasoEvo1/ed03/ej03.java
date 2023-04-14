
public class ej03 {

	public static void main(String[] args) {
		int suma = 0;
		double media = 0;
		int numeros[] = new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			suma = suma + numeros[i];
		}
		media = suma / numeros.length;
		System.out.println("La suma de todos los numeros es " + suma);
		System.out.println("La media de todos los numeros es " + media);
		
	}

}
