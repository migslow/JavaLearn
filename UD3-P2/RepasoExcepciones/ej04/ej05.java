package ej04;

/*
 * Crea una clase llamada "Conversor" con un método llamado "stringToDouble" que tome un string como argumento y devuelva el número double correspondiente. 
 * Utiliza un bloque try-catch para manejar la excepción de "NumberFormatException" si el argumento no es un número. 
 * Si el argumento no es un número, el método debe imprimir un mensaje de error y devolver -1.
 */

public class ej05 {

	public static void main(String[] args) {
		System.out.println(stringToDouble("125"));
		System.out.println(stringToDouble("Hola"));

	}
	
	public static double stringToDouble(String num) {
		try {
			return Double.parseDouble(num);
		} catch (NumberFormatException e) {
			System.out.println("El valor no es un numero");
		}
		return -1;
		
	}	

}
