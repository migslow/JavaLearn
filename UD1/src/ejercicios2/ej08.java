package ejercicios2;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double nota1, nota2, nota3, evaluacion;
		String nombre;
		System.out.println("Introduce el nombre del alumno que cursa: ");
		nombre = s.next();
		System.out.println("Introduce la nota de la 1º evaluacion: ");
		nota1 = s.nextDouble();
		System.out.println("Introduce la nota de la 2º evaluacion: ");
		nota2 = s.nextDouble();
		System.out.println("Introduce la nota de la 3º evaluacion: ");
		nota3 = s.nextDouble();
		evaluacion = (nota1 * nota2 * nota3) / 3;
		System.out.println("La nota promedio de la evaluacion de " + nombre + " es " + evaluacion);

	}

}
