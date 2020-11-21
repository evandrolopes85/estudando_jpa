package com.aprendendo.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo-pu");
		EntityManager entityManager = emf.createEntityManager();
		
		List<Evento> eventos = new ArrayList<Evento>();
		Evento e1 = new Evento();
		e1.setNome("Sopao");
		Evento e2 = new Evento();
		e2.setNome("Sopao Bras");
		eventos.add(e1);
		eventos.add(e2);
		
		entityManager.getTransaction().begin();
		entityManager.persist(e1);
		entityManager.persist(e2);
		entityManager.persist(new Pessoa(null, "Evandro", eventos));
		entityManager.getTransaction().commit();
		
		entityManager.close();
		emf.close();
	}

}
