 package TypedQuery;

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

import com.objectdb.o.LIN;
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
		System.out.println("\nEjercicio 1: ");
		TypedQuery<Object[]> tq1 = em.createQuery("SELECT e.nombre, e.alta FROM EmpleadoEntity e", Object[].class);
		List<Object[]> l1 = tq1.getResultList();
		for (Object[] r1 : l1) {
			System.out.println(r1[0] + " - " + r1[1]);
		}

		System.out.println("\nEjercicio 2: ");
		TypedQuery<Object[]> tq2 = em.createQuery(
				"select e.nombre, e.alta from EmpleadoEntity e where e.nombre like '%Carrera%'", Object[].class);
		List<Object[]> l2 = tq2.getResultList();
		for (Object[] r2 : l2) {
			System.out.println(r2[0] + " - " + r2[1]);
		}

		System.out.println("\nEjercicio 3: ");
		TypedQuery<Object[]> tq3 = em.createQuery(
				"select e.nombre, e.oficio ,e.departamento.nombre from EmpleadoEntity e where e.oficio = 'Empleado' and e.departamento.nombre = 'I+D'",
				Object[].class);
		List<Object[]> l3 = tq3.getResultList();
		for (Object[] r3 : l3) {
			System.out.println(r3[0] + " - " + r3[1] + " - " + r3[2]);
		}
		
		System.out.println("\nEjercicio 4:");
		TypedQuery<Object[]> tq4 = em.createQuery("select e.nombre, e.alta from EmpleadoEntity e where year(e.alta) >= 2003", Object[].class);
		List<Object[]> l4 = tq4.getResultList();
		for(Object[] r4 : l4) {
			System.out.println(r4[0] + " - " + r4[1]);
		}
		
	}// de demoJPQL
//--------------------------------------------------------------------------------------------------------------

	// EJERCICIOS METODOS CON LENGUAJE JPQL

	public int incrementarSalario(int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q1 = em.createQuery("update EmpleadoEntity set salario = salario + :c");
		q1.setParameter("c", cantidad);
		cuenta = q1.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int incrementarSalarioOficio(String oficio, int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q2 = em.createQuery("update EmpleadoEntity set salario = salario + : c where oficio = :o");
		q2.setParameter("c", cantidad);
		q2.setParameter("o", oficio);
		cuenta = q2.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}
	
	public int incrementarSalarioDepartamento(int numDepartamento, int cantidad) {
		int cuenta;
		em.getTransaction().begin();
		Query q3 = em.createQuery("update EmpleadoEntity set salario = salario + :c where departamento.dptoId = :d");
		q3.setParameter("c", cantidad);
		q3.setParameter("d", numDepartamento);
		cuenta = q3.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int borrarEmpleado(int numeroEmpleado) {
		int cuenta;
		em.getTransaction().begin();
		Query q4 = em.createQuery("delete from EmpleadoEntity where empnoId :c");
		q4.setParameter("c", numeroEmpleado);
		cuenta = q4.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int borrarDepartamentoEjercicio(int numeroDepartamento) {
		int cuenta;
		em.getTransaction().begin();
		Query q5 = em.createQuery("delete from DepartamentoEntity where dptoId = :c");
		q5.setParameter("c", numeroDepartamento);
		cuenta = q5.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int actualizarNombreEmpleado(int numeroEmpleado, String nombre) {
		int cuenta;
		em.getTransaction().begin();
		Query q6 = em.createQuery("update EmpleadoEntity set nombre = :n where empnoId = :e");
		q6.setParameter("n", nombre);
		q6.setParameter("e", numeroEmpleado);
		cuenta = q6.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int actualizarOficio(int numeroEmpleado, String oficio) {
		int cuenta;
		em.getTransaction().begin();
		Query q6 = em.createQuery("update EmpleadoEntity set oficio = :n where empnoId = :e");
		q6.setParameter("n", oficio);
		q6.setParameter("e", numeroEmpleado);
		cuenta = q6.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}

	public int actualizarComision(int numeroEmpleado, int comision) {
		int cuenta;
		em.getTransaction().begin();
		Query q6 = em.createQuery("update EmpleadoEntity set comision = :n where empnoId = :e");
		q6.setParameter("n", comision);
		q6.setParameter("e", numeroEmpleado);
		cuenta = q6.executeUpdate();
		em.getTransaction().commit();
		return cuenta;
	}
	
}
// de la clase
