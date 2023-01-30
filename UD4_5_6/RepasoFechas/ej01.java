import java.util.Date;

public class ej01 {

	public static void main(String[] args) {
		Date d = new Date();
		Date cumple = new Date(2002, 06, 21);

		long resultado = d.getTime() - cumple.getTime();
		System.out.println(resultado);
		int years = (int) (resultado / (1000L * 60 * 60 * 24 * 365));
		int days = (int) (resultado / (1000L * 60 * 60 * 24)) % 365;
		int hours = (int) (resultado / (1000L * 60 * 60)) % 24;
		int minutes = (int) (resultado / (1000L * 60)) % 60;
		int seconds = (int) (resultado / 1000L) % 60;

		System.out.println("The difference is: " + years + " years, " + days + " days, " + hours + " hours, " + minutes
				+ " minutes, and " + seconds + " seconds.");
	}

}
