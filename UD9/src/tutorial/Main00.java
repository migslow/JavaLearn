package tutorial;

//https://www.objectdb.com/tutorial/jpa/eclipse/store
// Adaptado por Alberto Carrera Mart�n - Abril 2020
import javax.persistence.*;
import java.util.*;

public class Main00 {
	public static void main(String[] args) {
		// Abre una conexi�n a la base de datos
		// Si no existe la base de datos entonces la crea
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db/p2.odb");
		EntityManager em = emf.createEntityManager();
		/*
		// Almacena 1.000 objetos punto en la base de datos:
		em.getTransaction().begin();
		for (int i = 0; i < 1000; i++) {
			Point p = new Point(i, i);
			em.persist(p);
		}
		em.getTransaction().commit();
		*/
		// Encuentra el n�mero de objetos Punto en la base de datos:
		Query q1 = em.createQuery("SELECT COUNT(p) FROM Point p");
		System.out.println("Total Puntos: " + q1.getSingleResult());

		// Calcula la media del atributo X de todos los puntos: 
		Query q2 = em.createQuery("SELECT AVG(p.x) FROM Point p");
		System.out.println("Media de  X: " + q2.getSingleResult());

		// Recupera todos los objetos Punto de la base de datos
		// y los almacena en una lista (l�nea 35)
		// Despu�s recorre todos los puntos de esa lista (l�nea 36)
		TypedQuery<Point> query = em.createQuery("SELECT p FROM Point p", Point.class);
		List<Point> results = query.getResultList();
		for (Point p : results) {
			System.out.println(p);
		}
		
		// Cierra la consulta y la conexi�n a la base de datos
		em.close();
		emf.close();
		
	}
}
