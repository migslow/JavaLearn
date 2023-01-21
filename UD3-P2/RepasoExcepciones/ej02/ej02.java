package ej02;

public class ej02 {

	public static void main(String[] args) {
		try {
			int n1 = 5, n2 = 0;
			int resultado = n1 / n2;
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException ae) {
			System.out.println("No se puede dividir por 0");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
