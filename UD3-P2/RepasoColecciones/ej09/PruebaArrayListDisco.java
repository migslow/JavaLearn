package ej09;

public class PruebaArrayListDisco {

	public static void main(String[] args) {
		ArrayListDisco lista = new ArrayListDisco();
		
		lista.anyadirDisco(new Disco(1, "Back in Black", "AC/DC", "Rock", "MP4", 4.22));
		lista.anyadirDisco(new Disco(2, "Thiller", "Michael Jackson", "Pop", "MP4", 3.54));
		lista.anyadirDisco(new Disco(3, "Algodon de azucar", "Chema Rivas", "Pop", "MP4", 2.59));

	}

}
