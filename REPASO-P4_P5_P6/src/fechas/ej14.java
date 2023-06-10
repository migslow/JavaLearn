package fechas;

import java.util.Date;

public class ej14 {

	public static void main(String[] args) {
		Date fecha1 = new Date();
		Date fecha2 = new Date(116, 6, 21);

		String descripcionFecha1 = fecha1.toString();
		System.out.println(descripcionFecha1);
		String descripcionFecha2 = fecha2.toString();
		System.out.println(descripcionFecha2);

		if (fecha1.after(fecha2)) {
			System.out.println("La fecha 1 es posterior a la fecha 2");
		} else {
			System.out.println("La fecha 1 es anterior a la fecha 2");
		}

		if (fecha2.before(fecha1)) {
			System.out.println("La fecha 2  es anterior a la fecha 1");
		} else {
			System.out.println("La fecha 2 es posteriro a la fecha 1");
		}

		long milisegundosFecha1 = fecha1.getTime();
		System.out.println("La cantidad de milisegundos de la fecha 1 es:: " + milisegundosFecha1);
		long milisegundosFecha2 = fecha2.getTime();
		System.out.println("La cantidad de milisegundos de la fecha 2 es:: " + milisegundosFecha2);

		if (fecha1.equals(fecha2)) {
			System.out.println("Las fechas son iguales");
		} else {
			System.out.println("Las fechas no son iguales");
		}

	}

}
