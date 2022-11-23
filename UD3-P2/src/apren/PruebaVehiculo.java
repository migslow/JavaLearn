package apren;

public class PruebaVehiculo {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo("Mercedes");
		v1.conducir();
		System.out.println(v1);
		Vehiculo v2 = new Vehiculo("Fiat");
		v2.conducir();
		System.out.println(v2);
	}

}
