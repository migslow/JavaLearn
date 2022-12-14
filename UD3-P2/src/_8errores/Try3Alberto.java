package _8errores;

public class Try3Alberto {
	public static void main(String arg[]) {
		int[] array = new int[20];
		try {
			// array[56] = 24;
			// int b = 0;
			// int a = 23/b;
			int c = Integer.parseInt("ALBERTO");
			System.out.println("�ltima instrucci�n del try");
		} catch (ArrayIndexOutOfBoundsException excepcion) {
			System.out.println(" Error de �ndice en un array");
		} catch (ArithmeticException excepcion) {
			System.out.println(" No se puede dividir entre 0");
		}

		catch (Exception e) {
			System.out.println(" Ocurri� un error");
			System.out.println(e.getMessage());
			e.printStackTrace();
			// Podr�amos tratar tambi�n el NumberFormatException...
		} finally {
			System.out.println("Esto se ejecuta seguro");
		}
		System.out.println("Siguiente instrucci�n al Try Catch...");
	}
}