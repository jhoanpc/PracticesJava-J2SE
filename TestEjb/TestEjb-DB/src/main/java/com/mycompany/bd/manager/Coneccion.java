package com.mycompany.bd.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Coneccion {

	private EntityManager entityManager;
	
	public Coneccion() {
		// TODO Auto-generated constructor stub
		getEntityManager();
	}
	
	public EntityManager getEntityManager() {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("MyBdSena");
		this.entityManager = managerFactory.createEntityManager();
		return this.entityManager;
	}

	

}
