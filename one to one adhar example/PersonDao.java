package org.alvas.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonDao {
EntityManagerFactory emf ;
EntityManager em;
EntityTransaction et;

public Person savePerson(Person person,Adhar adhar) {
	emf = Persistence.createEntityManagerFactory("vikas");
	em = emf.createEntityManager();
	et = em.getTransaction() ;
	et.begin();
	em.persist(adhar);
	em.persist(person);

	et.commit();
	return person;	
}
}
