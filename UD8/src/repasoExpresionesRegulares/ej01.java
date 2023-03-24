package repasoExpresionesRegulares;

public class ej01 {

	public static void main(String[] args) {
		System.out.println("70588387F: " + validaDNI("70588387F"));
	}

	public static boolean validaDNI(String DNI) {
		return DNI.matches("^[0-9]{8}[A-Z]{1}$");
		// ^ ==> indica que tiene que empezar de una manera
		// & ==> indica que tiene que acabar de una manera
	}

}
