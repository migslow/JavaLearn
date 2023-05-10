package Examen_6;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class AccesoBOODatos {
	private EntityManagerFactory emf;
	private EntityManager em;

	public void conectar() {
		emf = Persistence.createEntityManagerFactory("db/jugadores.odb");
		em = emf.createEntityManager();
	}

	public void datosIniciales() {
		Pais p1 = new Pais(1, "Espa�a");
		Pais p2 = new Pais(2, "Portugal");
		Pais p3 = new Pais(3, "Francia");
		Pais p4 = new Pais(4, "Italia");

		Jugador j1 = new Jugador("Alberto Carrera", "voleibol", "Huesca", 44, p1);
		Jugador j2 = new Jugador("Luis Aldea", "f�tbol", "Zaragoza", 35, p2);
		Jugador j3 = new Jugador("Mario Carrera", "baloncesto", "Huesca", 21, p1);
		Jugador j4 = new Jugador("Raquel Carrera", "baloncesto", "Huesca", 24, p1);
		Jugador j5 = new Jugador("To�o M�riz", "tenis", "Oporto", 45, p2);
		Jugador j6 = new Jugador("Lorenzo Blasco", "f�tbol", "Lisboa", 46, p2);
		Jugador j7 = new Jugador("Nacho Garc�s", "baloncesto", "Lisboa", 46, p2);
		Jugador j8 = new Jugador("Bel�n Carrera", "tenis", "Paris", 39, p3);
		Jugador j9 = new Jugador("Javier Escart�n", "f�tbol", "Toulouse", 44, p3);

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(j1);
		em.persist(j2);
		em.persist(j3);
		em.persist(j4);
		em.persist(j5);
		em.persist(j6);
		em.persist(j7);
		em.persist(j8);
		em.persist(j9);
		em.getTransaction().commit();

	}

	public void desconectar() {
		em.close();
		emf.close();
	}

	public boolean borrarPais(int codigoPais) {
		if (em.find(Pais.class, codigoPais) != null) {
			em.getTransaction().begin();
			Query q1 = em.createQuery("delete from Pais where id = :p");
			q1.setParameter("p", codigoPais);
			q1.executeUpdate();
			em.getTransaction().commit();
			return true;
		} else
			return false;
	}

	public void jugadoresPorDeporte(String deporte) {
		TypedQuery<Object[]> tq1 = em.createQuery("select j.nombre, j.edad, j.pais.nombrePais from Jugador j where j.deporte = '" + deporte + "'",
				Object[].class);
		List<Object[]> l1 = tq1.getResultList();
		for (Object[] r1 : l1) {
			System.out.println(r1[0] + " - " + r1[1] + " - " + r1[2]);
		}
	}

} // de la clase AccesoBdatos
