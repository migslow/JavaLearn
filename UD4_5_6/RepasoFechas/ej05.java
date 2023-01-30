import java.util.Date;

public class ej05 {

	public static void main(String[] args) {
		Date d = new Date();
		Date f = new Date(180,7,2);

		System.out.println("Tiempo en milisegundos: " + d.getTime());

		int dia = d.getDate();
		int mes = d.getMonth() + 1;
		int anyo = d.getYear() + 1900;
		
		System.out.println("Fecha actual: " + dia + "/" + mes + "/" + anyo);

		long resultado = f.getTime() - d.getTime();
		
		System.out.println("La diferencia entre las dos fechas es de: " + resultado);
	}

}
