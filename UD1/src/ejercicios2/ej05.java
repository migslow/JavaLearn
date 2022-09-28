package ejercicios2;

public class ej05 {

	public static void main(String[] args) {
		int num1 = 0;
		while (num1 <= 100) {
			if (num1 % 2 == 0 || num1 % 3 == 0) {
				System.out.println(num1);
			}
			num1++;
		}

	}

}
