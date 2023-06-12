
public class ej31 {

	public static void main(String[] args) {
		double[][] notas = { { 5.6, 9.4, 6.8, 7}, 
							 { 6.9, 5.2, 5.7, 6.3},
							 { 9.8, 8, 7.6, 8.5 } 
							 };
		maxMinMediaAlumno(notas);
	}
	
	// Apartado A:
	
	public static void maxMinMediaAlumno(double[][]notas) {
		double media = 0, max = 0, min = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				max = notas[i][0];
				min = notas[i][0];
				if(notas[i][j] > max) {
					max = notas[i][j];
				}
				if(notas[i][j] < min) {
					min = notas[i][j];
				}
				
			}
			
		}
		System.out.println("\nEL maximo es: " + max);
		System.out.println("EL minimo es: " + min);
		
	}

}
