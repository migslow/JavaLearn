package Examen_2;
import java.util.Arrays;

public class MiguelOvejero5 {

	public static int numerosAleatorio(int[][] m) {
		int n = (int) (Math.random() * 201);
		return n;
	}

	public static void rellenarArray(int[][] m) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(numerosAleatorio(m) + "\t");
			}
			System.out.println(" ");
		}
	}

	public static void ordenacion(int[][] m) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Arrays.sort(m);
				System.out.print(m[i][j] + " - ");
			}

		}
	}

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];

		numerosAleatorio(matriz);
		rellenarArray(matriz);
		ordenacion(matriz);
		
		

	}// del main
		//
} // de Pregunta5Alumno
/*
 * Antes de ordenar 180 6 92 8 179 27 101 13 198 44 88 16 198 135 39 136 53 75
 * 55 68 141 17 151 78 28 182 92 38 114 194 31 58 41 16 129 26 76 170 107 99 161
 * 27 161 187 0 170 3 183 196 70 150 145 181 180 14 118 107 1 85 173 52 142 163
 * 133 44 69 84 160 145 109 186 54 35 171 98 81 43 95 16 191 41 122 36 86 65 149
 * 12 76 106 94 160 5 38 64 189 101 5 57 46 110
 * 
 * 
 * ------------------------------------------------------ Despu�s de ordenar 0 1
 * 3 5 5 6 8 12 13 14 16 16 16 17 26 27 27 28 31 35 36 38 38 39 41 41 43 44 44
 * 46 52 53 54 55 57 58 64 65 68 69 70 75 76 76 78 81 84 85 86 88 92 92 94 95 98
 * 99 101 101 106 107 107 109 110 114 118 122 129 133 135 136 141 142 145 145
 * 149 150 151 160 160 161 161 163 170 170 171 173 179 180 180 181 182 183 186
 * 187 189 191 194 196 198 198
 * 
 */