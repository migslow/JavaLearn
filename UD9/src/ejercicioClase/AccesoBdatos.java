package ejercicioClase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
//
// Alberto Carrera Mart�n - Abril 2020
//

public class AccesoBdatos {
	private EntityManagerFactory emf;
	private EntityManager em;

	public void conectar() {
		emf = Persistence.createEntityManagerFactory("db/empleados.odb");
		em = emf.createEntityManager();
	}

	public void desconectar() {
		em.close();
		emf.close();
	}

	public DepartamentoEntity buscarDepartamento(int numDepartamento) {
		return em.find(DepartamentoEntity.class, numDepartamento);
	}// de m�todo buscarDepartamento
		//

	@SuppressWarnings("deprecation")
	public void imprimirDepartamento(int numDepartamento) {
		DepartamentoEntity d = buscarDepartamento(numDepartamento);
		if (d == null) {
			System.out.println("No existe el Departamento " + numDepartamento);
		} else {
			Set<EmpleadoEntity> empleados = d.getEmpleados();
			String datos = "Datos del departamento " + numDepartamento + ": ";
			datos += "Nombre: " + d.getNombre() + " - Localidad: " + d.getLocalidad() + "\n";
			if (empleados.isEmpty()) {
				datos += "No tiene empleados en este momento";
			} else {
				datos += "Lista de empleados" + "\n";
				datos += "*******************";
			}
			for (EmpleadoEntity empleado : empleados) {
				datos += "\nN�mero de empleado: " + empleado.getEmpnoId() + "\n";
				datos += "Nombre: " + empleado.getNombre() + "\n";
				datos += "Oficio: " + empleado.getOficio() + "\n";
				if (empleado.getDirId() == null) {
					datos += "Jefe: No tiene" + "\n";
				} else {
					datos += "Jefe: " + empleado.getDirId().getNombre() + "\n";
					datos += "A�o de alta: " + (empleado.getAlta().getYear() + 1900) + "\n";
					datos += "Salario: " + empleado.getSalario() + "\n";
				}
				if (empleado.getComision() == null) {
					datos += "Comisi�n: No tiene" + "\n";
				} else {
					datos += "Comisi�n: " + empleado.getComision() + "\n";
				}
			}

			System.out.println(datos);
		}
	} // de m�todo imprimirDepartamento

	public boolean insertarDepartamento(DepartamentoEntity d) {
		if (buscarDepartamento(d.getDptoId()) != null)
			return false;
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return true;
	} // de insertarDepartamento

	public boolean modificarDepartamento(DepartamentoEntity d) {
		DepartamentoEntity departamentoBuscado = buscarDepartamento(d.getDptoId());
		if (departamentoBuscado == null)
			return false;
		em.getTransaction().begin();
		departamentoBuscado.setNombre(d.getNombre());
		departamentoBuscado.setLocalidad(d.getLocalidad());
		em.persist(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento

	// Si tiene empleados lo borrar�a igual, dejando en estos el n�mero de
	// Departamento
	// pero el resto de los atributos del departamento a null. Por eso no dejo
	// borrar

	public boolean borrarDepartamento(int numDepartamento) {
		DepartamentoEntity departamentoBuscado = buscarDepartamento(numDepartamento);
		if (departamentoBuscado == null || !departamentoBuscado.getEmpleados().isEmpty())
			return false;
		em.getTransaction().begin();
		em.remove(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento

	// EJERCICIOS CONSULTAS

	public void demoJPQL() {
		System.out.println("\nConsulta ejemplo 1: ");
		Query q1 = em.createQuery("SELECT COUNT(d) FROM DepartamentoEntity d");
		System.out.println("Total Departamentos: " + q1.getSingleResult());

		System.out.println("\nConsulta ejemplo 2: ");
		TypedQuery<Long> tq1 = em.createQuery("SELECT COUNT(d) FROM DepartamentoEntity d", Long.class);
		System.out.println("Total Departamentos: " + tq1.getSingleResult());

		System.out.println("\nConsulta ejemplo 3: ");
		TypedQuery<DepartamentoEntity> tq2 = em.createQuery("SELECT d FROM DepartamentoEntity d",
				DepartamentoEntity.class);
		List<DepartamentoEntity> l2 = tq2.getResultList();
		for (DepartamentoEntity r2 : l2) {
			System.out.println("Nombre:  " + r2.getNombre() + ", Localidad: " + r2.getLocalidad());
		}

		System.out.println("\nConsulta ejemplo 4: ");
		TypedQuery<Object[]> tq3 = em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity  d",
				Object[].class);
		List<Object[]> l3 = tq3.getResultList();
		for (Object[] r3 : l3) {
			System.out.println("Nombre:  " + r3[0] + ", Localidad: " + r3[1]);
		}

		System.out.println("\nConsulta ejemplo 5: ");
		TypedQuery<Object[]> tq4 = em.createQuery(
				"SELECT d.nombre, d.localidad FROM DepartamentoEntity d" + " WHERE d.dptoId != :n", Object[].class);
		tq4.setParameter("n", 10);
		List<Object[]> l4 = tq4.getResultList();
		for (Object[] r4 : l4) {
			System.out.println("Nombre:  " + r4[0] + ", Localidad: " + r4[1]);
		}

		// EJERCICIO 1
		System.out.println("\nEjercicio 1: ");
		TypedQuery<Object[]> tq5 = em.createQuery("SELECT e.nombre, e.alta FROM EmpleadoEntity e", Object[].class);
		List<Object[]> l5 = tq5.getResultList();
		for (Object[] r5 : l5) {
			System.out.println(r5[0] + " - " + r5[1] + " - ");
		}

		// EJERCICIO 2
		System.out.println("\nEjercicio 2: ");
		TypedQuery<Object[]> tq6 = em.createQuery(
				"select e.nombre, e.alta from EmpleadoEntity e where e.nombre like '%Carrera%' or e.nombre like '%Carrera%'",
				Object[].class);
		List<Object[]> l6 = tq6.getResultList();
		for (Object[] r6 : l6) {
			System.out.println(r6[0] + " - " + r6[1] + " - ");
		}

		// EJERICICO 3
		System.out.println("\nEjercicio 3: ");
		TypedQuery<Object[]> tq7 = em.createQuery(
				"select e.nombre, e.oficio, e.departamento.nombre from EmpleadoEntity e where e.oficio = 'Empleado' and e.departamento.nombre = 'I+D'",
				Object[].class);
		List<Object[]> l7 = tq7.getResultList();
		for (Object[] r7 : l7) {
			System.out.println(r7[0] + " - " + r7[1] + " - " + r7[2]);
		}

		// EJERCICIO 4
		System.out.println("\nEjercicio 4: ");
		TypedQuery<Object[]> tq8 = em.createQuery(
				"select e.nombre, e.alta from EmpleadoEntity e where year(e.alta) >= 2003", Object[].class);
		List<Object[]> l8 = tq8.getResultList();
		for (Object[] r8 : l8) {
			System.out.println(r8[0] + " - " + r8[1] + " - ");
		}

		// EJERCICIO 5
		System.out.println("\nEjercicio 5: ");
		TypedQuery<Object[]> tq9 = em.createQuery(
				"select d.nombre, d.empleados.nombre from DepartamentoEntity d order by d.nombre", Object[].class);
		List<Object[]> l9 = tq9.getResultList();
		for (Object[] r9 : l9) {
			System.out.println(r9[0] + " - " + r9[1] + " - ");
		}

		// EJERCICIO 6
		System.out.println("\nEjercicio 6: ");
		TypedQuery<Object[]> tq10 = em.createQuery(
				"select e.departamento.nombre, count(e), sum(e.salario), max(e.salario) from EmpleadoEntity e group by e.departamento",
				Object[].class);
		List<Object[]> l10 = tq10.getResultList();
		for (Object[] r10 : l10) {
			System.out.println(r10[0] + " - " + r10[1] + " - " + r10[2] + " - " + r10[3] + " - ");
		}

		// EJERICIO 7
		System.out.println("\nEjercicio 7: ");
		TypedQuery<Object[]> tq11 = em.createQuery(
				"select e.departamento.nombre, count(e), sum(e.salario), max(e.salario) from EmpleadoEntity e group by e.departamento having count(e)>=5",
				Object[].class);
		List<Object[]> l11 = tq11.getResultList();
		for (Object[] r11 : l11) {
			System.out.println(r11[0] + " - " + r11[1] + " - " + r11[2] + " - " + r11[3] + " - ");
		}

		// EJERCICIO 8
		System.out.println("\nEjercicio 8: ");
		TypedQuery<Object[]> tq12 = em.createQuery(
				"select e.nombre, e.dirId.nombre, e.departamento.dptoId from EmpleadoEntity e", Object[].class);
		List<Object[]> l12 = tq12.getResultList();
		for (Object[] r12 : l12) {
			System.out.println(r12[0] + " - su jefe es - " + r12[1] + " - departamento - " + r12[2]);
		}

		// Ejercicio 9
		System.out.println("\nEjercicio 9: ");
		TypedQuery<Object[]> tq13 = em.createQuery(
				"select d.nombre, count(d.empleados) from DepartamentoEntity d group by d.nombre", Object[].class);
		List<Object[]> l13 = tq13.getResultList();
		for (Object[] r13 : l13) {
			System.out.println(r13[0] + " - " + r13[1] + " - ");
		}

		// EJERCICIO 10
		System.out.println("\nEjercicio 10: ");
		TypedQuery<Object[]> tq14 = em.createQuery(
				"SELECT d.nombre,count(d2) FROM DepartamentoEntity d left JOIN d.empleados d2 group by d.nombre",
				Object[].class);
		List<Object[]> l14 = tq14.getResultList();
		for (Object[] r14 : l14) {
			System.out.println(r14[0] + " - " + r14[1] + " - ");
		}

		// EJERCICIO 11
		System.out.println("\nEjercicio 11: ");
		TypedQuery<Object[]> tq15 = em.createQuery(
				"SELECT d.departamento.dptoId, d.nombre, d.salario FROM EmpleadoEntity d order by d.departamento.dptoId desc, d.salario asc",
				Object[].class);
		List<Object[]> l15 = tq15.getResultList();
		for (Object[] r15 : l15) {
			System.out.println(r15[0] + " - " + r15[1] + " - " + r15[2] + " - ");
		}

		// EJERCICIO 12
		System.out.println("\nEjercicio 12: ");
		TypedQuery<Object[]> tq16 = em
				.createQuery("select e.empnoId, e.nombre from EmpleadoEntity e where e.dirId is null", Object[].class);
		List<Object[]> l16 = tq16.getResultList();
		for (Object[] r16 : l16) {
			System.out.println(r16[0] + " - " + r16[1] + " - ");
		}
		// EJERCICIO 13
		System.out.println("\nEjercicio 13: ");
		TypedQuery<Object[]> tq17 = em.createQuery(
				"select d.dptoId, d.nombre from DepartamentoEntity d where d.empleados.empnoId = 1039", Object[].class);
		List<Object[]> l17 = tq17.getResultList();
		for (Object[] r17 : l17) {
			System.out.println(r17[0] + " - " + r17[1] + " - ");
		}
	}// de demoJPQL
//--------------------------------------------------------------------------------------------------------------

	// EJERCICIOS METODOS CON LENGUAJE JPQL

	public int incrementarSalario(int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q1 = em.createQuery("update EmpleadoEntity set salario = salario + :c ");
		q1.setParameter("c", cantidad);
		cuenta = q1.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int incrementarSalarioOficio(String oficio, int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q2 = em.createQuery("update EmpleadoEntity set salario = salario + :c where oficio = :o");
		q2.setParameter("c", cantidad);
		q2.setParameter("o", oficio);
		cuenta = q2.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int incrementarSalarioDepartamento(int numDepartamento, int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q3 = em
				.createQuery("update EmpleadoEntity set salario = salario + :c where departamento.getDptoId() = :d");
		q3.setParameter("d", numDepartamento);
		q3.setParameter("c", cantidad);
		cuenta = q3.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int borrarEmpleado(int numeroEmpleado) {
		int cuenta;
		em.getTransaction().begin();
		Query q4 = em.createQuery("delete from EmpleadoEntity where empnoId = :n");
		q4.setParameter("n", numeroEmpleado);
		cuenta = q4.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int borrarDepartamentoEjercicio(int numeroDepartamento) {
		int cuenta;
		em.getTransaction().begin();
		Query q5 = em.createQuery("delete from DepartamentoEntity where dptoId = :n");
		q5.setParameter("n", numeroDepartamento);
		cuenta = q5.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

}
// de la clase
