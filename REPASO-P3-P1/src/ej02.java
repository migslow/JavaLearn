import java.util.Scanner;

public class ej02 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int [] numeros = new int[10];
		

	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			v[i] = s.nextInt();
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static void comprobar(int[]v) {
		int pos = 0, neg = 0, ceros = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] >= 0) {
				pos++;
			}
			if(v[i] < 0) {
				neg++;
			}
			if(v[i] == 0) {
				ceros++;
			}
		}
		System.out.println("Numeros positivos: " + pos);
		System.out.println("Numeros negativo: " + neg);
		System.out.println("Numeros cero: cero " + ceros);
	}

}
