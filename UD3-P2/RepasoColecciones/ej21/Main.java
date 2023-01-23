package ej21;

public class Main {
	public static void main(String[] args) {
		EjercicioArrayList listaEstudiantes = new EjercicioArrayList();
		
		Estudiante e1 = new Estudiante("Jose", 21);
		
		System.out.println(listaEstudiantes.llenarLista(new Estudiante("Miguel", 20)));
		System.out.println(listaEstudiantes.llenarLista(new Estudiante("Alberto", 41)));
		System.out.println(listaEstudiantes.llenarLista(new Estudiante("Jaime", 19)));
		System.out.println(listaEstudiantes.llenarLista(new Estudiante("Pedro", 43)));
		System.out.println(listaEstudiantes.llenarLista(new Estudiante("Maria", 18)));
		
		// System.out.println(listaEstudiantes.agregarEstudiante(e1));
		System.out.println(listaEstudiantes.buscarEstudiante("Ja"));
		System.out.println();
		listaEstudiantes.modificarEstudiante("Miguel", 21);
		
		listaEstudiantes.eliminarEstudiante("Jaime");
		
		listaEstudiantes.mostrarLista();
	}

}
