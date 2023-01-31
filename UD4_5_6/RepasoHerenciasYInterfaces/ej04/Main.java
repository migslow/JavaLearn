package ej04;

public class Main {
	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setModelo("Camry");
		vehiculo.setAnyo(2020);
		vehiculo.setNumeroRuedas(4);

		Automovil automóvil = new Automovil();
		automóvil.setMarca("Honda");
		automóvil.setModelo("Civic");
		automóvil.setAnyo(2022);
		automóvil.setNumeroRuedas(4);
		automóvil.setTipoCombustible("Gasolina");
		automóvil.setPuertas(4);

		System.out.println(vehiculo);
		System.out.println(automóvil);
	}
}
