package ej04;
/*
 * 
 */

public class ej04 {

	public static int stringToInt(String num) {
		try {
			return Integer.parseInt(num);
		} catch (NumberFormatException e) {
			System.out.println("Error: El valor proporcionado no es un número");
			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println(stringToInt("25"));
	}

}
