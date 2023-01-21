package ej13;

import java.util.ArrayList;
import java.util.Random;

public class ej01 {
	public static void main(String[] args) {

		Random ran = new Random();

		int suma = 0;
		int size = ran.nextInt(11) + 10;

		System.out.println("el size del array es " + size);
		ArrayList<Integer> al = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < size; i++) {
			al.add(ran.nextInt(101));
		}
		System.out.println(al);
		// la suma
		for (int num : al) {
			suma = suma + num;
		}
		// la media
		int media = suma / size;

		for (int num : al) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Máximo: " + max);
		System.out.println("Mínimo: " + min);
	}

}
