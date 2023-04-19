package repaso;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos bd = new AccesoBdatos();
		bd.conectar();
		System.out.println(bd.busquedaPorCodigo1(100));
		System.out.println(bd.busquedaPorCodigo1(7788));
		System.out.println("");
		System.out.println(bd.busquedaPorCodigo2(100));
		System.out.println(bd.busquedaPorCodigo2(7788));
		System.out.println("\nBusqueda por nombre: ");
		System.out.println(bd.busquedaPorNombre("SMITH"));
		System.out.println(bd.busquedaPorNombre("smith"));
		System.out.println(bd.busquedaPorNombre("FORD"));
		System.out.println("\nBusqueda por trabajo desempeñado: ");
		System.out.println(bd.busquedaPorTrabajo("SALESMAN"));
		System.out.println(bd.busquedaPorTrabajo("MANAGER"));
		System.out.println("\nBuscaqueda por jefe: ");
		System.out.println(bd.buscarPorJefe(7902));
		System.out.println(bd.buscarPorJefe(7698));
		System.out.println("\nBusqueda por salario: ");
		System.out.println(bd.buscarPorSalario(1600));
		System.out.println(bd.buscarPorSalario(8000));
		System.out.println("\nBusqueda por comision: ");
		System.out.println(bd.busquedaPorComision(300));
		System.out.println(bd.busquedaPorComision(3000));
		System.out.println("\nBuscar por numero de departamento: ");
		System.out.println(bd.busquedaPorDepartamento(20));
		System.out.println(bd.busquedaPorDepartamento(30));
		

	}

}
