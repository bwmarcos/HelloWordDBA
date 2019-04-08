package aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import domino.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		em.close();*/
		
		TypedQuery<Pessoa> query =
			      em.createQuery("SELECT p FROM Pessoa p", Pessoa.class);
			  List<Pessoa> results = query.getResultList();
		
		
		//Pessoa p = em.find(Pessoa.class, 2);
		
		//System.out.println(p);
		System.out.println(results);
		
		
	}
		
		

}
