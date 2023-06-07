import java.util.Scanner;

public class ej06 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nombres = new String[2];
		int[] sueldos = new int[2];
		rellenarArray(nombres, sueldos);
		masRico(nombres, sueldos);

	}

	public static void rellenarArray(String[] nom, int[] sue) {
		for (int i = 0; i < nom.length; i++) {
			System.out.println("Introduce el nombre en la posicion:[" + i + "]");
			nom[i] = s.next();
		}
		
		for (int i = 0; i < sue.length; i++) {
			System.out.println("Introduce el sueldo en la posicion:[" + i + "]");
			sue[i] = s.nextInt();
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Empleado " + i + ": " + "		" + nom[i] + "		" + sue[i]);
		}
	}
	
	public static int maximo(int[] sue) {
		int max = 0;
		for (int i = 0; i < sue.length; i++) {
			if (sue[i] > max) {
				max = sue[i];
			}
		}
		return max;
	}
	
	public static void masRico(String[] nom, int[] sue) {
		for (int i = 0; i < sue.length; i++) {
			if(sue[i] == maximo(sue)) {
				System.out.println("El empleado mejor pagado es " + nom[i] + " que cobra " + sue[i] + " Euros");
			}
		}
	}

}
