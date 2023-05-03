package ejercicioClase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main2 {

	public static void main(String[] args) throws ParseException {

		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		// abd.buscarDepartamento(10);
		
		// abd.imprimirDepartamento(90);
		// abd.imprimirDepartamento(40);
		// abd.imprimirDepartamento(10);
		
		
		// System.out.println(abd.insertarDepartamento(new
		// DepartamentoEntity(60,"Recursos Humanos", "Chimillas")));
		// System.out.println(abd.insertarDepartamento(new
		// DepartamentoEntity(60,"Recursos Humanos", "Chimillas")));
		// abd.imprimirDepartamento(60);
		
		
		// System.out.println(abd.modificarDepartamento(new
		// DepartamentoEntity(88,"RRHH", "Huerrios")));
		// System.out.println(abd.modificarDepartamento(new
		// DepartamentoEntity(60,"RRHH", "Esquedas")));
		// abd.imprimirDepartamento(60);
		
		
		// abd.borrarDepartamento(88); // false no existe
		// abd.borrarDepartamento(60); // true
		// abd.borrarDepartamento(10); // false pues tiene empleados
		
		// abd.imprimirDepartamento(10);

		abd.demoJPQL();
		System.out.println();
		System.out.println("Salarios actualizados: " + abd.incrementarSalario(200));
		System.out.println("Salarios actualizados buscado por oficio: " + abd.incrementarSalarioOficio("Empleado", 200));
		System.out.println("Salarios actualizados buscado por departamento: " + abd.incrementarSalarioDepartamento(10, 200));
		System.out.println("Empleados borrados: " + abd.borrarEmpleado(1034));
		System.out.println("Departamentos borrados: " + abd.borrarDepartamentoEjercicio(10));
		System.out.println("Actualizado el nombre: " + abd.actualizarNombreEmpleado(1039, "Miguel Ovejero Piedrafita"));
		System.out.println("Actualizar oficio: " + abd.actualizarOficio(1039, "CEO"));
		System.out.println("Actualizar comision: " + abd.actualizarComision(1039, 1400));

		abd.desconectar();

	}

}
