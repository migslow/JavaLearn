package ej06;

public class Main {

	public static void main(String[] args) {
		ListaConstruccion lista = new ListaConstruccion();

		Empleado c1 = new Empleado("Miguel");
		Directivo d1 = new Directivo("Jose", "Departamento de arquitectura");

		Operario op1 = new Operario("Maria");
		Oficial of1 = new Oficial("Luis", "RetiraEscombros", "Grupo1");
		Tecnico t1 = new Tecnico("Luisa", "GiraTuercas", 60);

		lista.crearConstruccion(c1);
		lista.crearConstruccion(d1);
		lista.crearConstruccion(op1);
		lista.crearConstruccion(of1);
		lista.crearConstruccion(t1);

		lista.mostrarInformacion();

	}

}
