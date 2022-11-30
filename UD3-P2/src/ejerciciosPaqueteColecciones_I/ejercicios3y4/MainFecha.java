package ejerciciosPaqueteColecciones_I.ejercicios3y4;

public class MainFecha {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(30, 11, 2022);
		System.out.println(f1);
		System.out.println(f1.diaSemana());
		System.out.println(f1.diasTranscurridos());
		f1.corta();
		System.out.println();
		f1.larga();

	}

}
