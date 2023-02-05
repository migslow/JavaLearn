package ej12;

public class Main {

	public static void main(String[] args) {
		ListaClaseD l = new ListaClaseD();

		System.out.println(ClaseD.getTotal());
		ClaseE z1 = new ClaseE("Soy z1", 10);
		ClaseE z2 = new ClaseE("Soy z2", 20);
		ClaseE z3 = new ClaseE("Soy z3", 30);
		ClaseF y1 = new ClaseF("Soy y1", " de la Clase Y");
		ClaseF y2 = new ClaseF("Soy y2", " de la Clase Y");
		System.out.println(ClaseD.getTotal());
		System.out.println(z1.compareTo(z2));
		y1.operacionD();
		z2.operacionD();
		z3.saludo();
		l.crearObjeto(z1);
		l.crearObjeto(z2);
		l.crearObjeto(z3);
		l.crearObjeto(y1);
		l.crearObjeto(y2);
		l.mostrarInformacion();

	}

}
