package ejOrdenacion;

import java.util.Arrays;

public class ej01 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		rellenarArray(matriz);
		ordenarMatriz(matriz);
		System.out.println();
		imprimirMatriz(matriz);
	}

	public static void rellenarArray(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				v[i][j] = (int) (Math.random() * 201);
			}
		}

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j] + " - ");
			}
			System.out.println("");
		}
	}

	public static void ordenarMatriz(int[][] matriz) {
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length - 1; j++) {
	        	for (int x = 0; x < matriz.length - 1; x++) {
	        		int aux = matriz[i][j], auxSig = matriz[i][j + 1];
		            if(aux > auxSig) {
		                matriz[i][j] = auxSig;
		                matriz[i][j+1] = aux;
		            }
				}
	            
	        }
	    }
	}


	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
