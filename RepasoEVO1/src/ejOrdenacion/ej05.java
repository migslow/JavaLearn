package ejOrdenacion;

import java.util.Arrays;
import java.util.Random;

public class ej05 {
	public static void main(String[] args) {
        // Creamos un array bidimensional de 5 filas y 4 columnas
        int[][] arr = new int[5][4];
        
        // Llenamos el array con números aleatorios del 1 al 100
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(100) + 1;
            }
        }
        
        // Imprimimos el array antes de ordenarlo
        System.out.println("Array antes de ordenarlo:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        
        // Ordenamos el array utilizando el método de burbuja
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k+1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k+1];
                        arr[i][k+1] = temp;
                    }
                }
            }
        }
        
        // Imprimimos el array después de ordenarlo
        System.out.println("Array después de ordenarlo:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
