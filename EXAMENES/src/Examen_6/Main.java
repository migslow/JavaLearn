package Examen_6;

public class Main {

	public static void main(String[] args) {
		
		AccesoBOODatos abd = new AccesoBOODatos();
		
		abd.conectar();
		
		// Una vez ejecutado el m�todo datosIniciales
		// comentarlo para que no se vuelva a ejecutar
		// abd.datosIniciales();	
		/************************************************/
		
		abd.jugadoresPorDeporte("fútbol");
		/* 	Javier Escart�n - 44 - Francia
			Lorenzo Blasco - 46 - Portugal
			Luis Aldea - 35 - Portugal
		 */
		abd.jugadoresPorDeporte("futbolin");
		/* No se lista a nadie */
		/**************************************************/
	
		
	// System.out.println(abd.borrarPais(2)); // true, borra a Espa�a
	// System.out.println(abd.borrarPais(5)); // false, no existe
		
	
		abd.desconectar();
	}

}
