package RepasoHerencia06;

import RepasoHerencia01.ClaseB;
import RepasoHerencia01.ClaseY;
import RepasoHerencia01.Lista;
import RepasoHerencia01.claseZ;

public class Main {
	public static void main(String[] args) {
		Lista l = new Lista();

		System.out.println(ClaseB.getCuenta());
		claseZ z1 = new claseZ("Soy z1", 10);
		claseZ z2 = new claseZ("Soy z2", 20);
		claseZ z3 = new claseZ("Soy z3", 30);
		ClaseY y1 = new ClaseY("Soy y1", " de la Clase Y");
		ClaseY y2 = new ClaseY("Soy y2", " de la Clase Y");
		System.out.println(ClaseB.getCuenta());
		System.out.println(z1.compareTo(z2));
		y1.metodoX();
		z2.metodoX();
		z3.saludo();
		l.anyadir(z1);
		l.anyadir(z2);
		l.anyadir(z3);
		l.anyadir(y1);
		l.anyadir(y2);
		l.mostrarLista();
		System.out.println(l.cuentaZ());
	}
}
