package ej03;

public class ej16 {
	public static int votosCandidato(int[][] resultados, int candidato) {
		int total, suma = 0;
		for (int j = 0; j < resultados[0].length; j++) {
			total = resultados[0][j];
			for (int i = 0; i < resultados.length; i++) {
				suma = suma + resultados[0][j];
			}
			System.out.println("El candidato " + candidato + " tiene " + suma + " votos");
		}

		return suma;// Sustituir este valor por el que corresponda
		//
	}// de votosCandidato

	public static void main(String[] args) {
		int[][] resultados = { { 194, 48, 206, 45 }, { 180, 20, 320, 16 }, { 221, 90, 140, 20 }, { 432, 50, 821, 14 },
				{ 820, 61, 946, 18 } };
		System.out.println(votosCandidato(resultados, 1)); // 1847 (primera columna)
		System.out.println(votosCandidato(resultados, 4)); // 113 (�ltima columna)
		System.out.println(votosCandidato(resultados, 0)); // 0 No existe el candidato 0
		System.out.println(votosCandidato(resultados, 5)); // 0 No existe el candidato 5

	} // del main
}
