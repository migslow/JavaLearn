package ej02;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();
		
		System.out.println(ClaseB.getCuenta());
		ClaseZ z1 = new ClaseZ("Soy z1", 10);
		ClaseZ z2 = new ClaseZ("Soy z2", 20);
		ClaseZ z3 = new ClaseZ("Soy z3", 30);
		ClaseY y1 = new ClaseY("Soy y1", " de la Clase Y");
		ClaseY y2 = new ClaseY("Soy y2", " de la Clase Y");
		System.out.println(ClaseB.getCuenta());
		System.out.println(z1.compareTo(z2));
		y1.metodoX();
		z2.metodoX();
		z3.saludo();
		l.insertar(z1);
		l.insertar(z2);
		l.insertar(z3);
		l.insertar(y1);
		l.insertar(y2);
		l.recorrer();
		System.out.println(l.cuentaZ());
		

	}

}
