package RepasoExamen;

public class ej03 {

	public static void main(String[] args) {
		int [] numeros = new int [20];
		rellenarArray(numeros);
		apareceNumero(numeros);
	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 201);
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static void apareceNumero(int[] v) {
	    for (int i = 0; i < v.length; i++) {
	        int contador = 0;  // Mover la declaración e inicialización del contador aquí
	        for (int j = 0; j < v.length; j++) {
	            if (v[i] == v[j]) {
	                contador++;
	            }
	        }
	        System.out.println("El número " + v[i] + " aparece " + contador + " veces");
	    }
	}


}
