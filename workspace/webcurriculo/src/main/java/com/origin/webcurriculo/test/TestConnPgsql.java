//package com.origin.webcurriculo.test;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConnPgsql {
//	
//	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
//	
//	private EntityManager entityManager = entityManagerFactory.createEntityManager();
//	
//	private Session sessionConnDB = null;
//	
//	/*
//	 * @Bean 
//	 * @Author Renan
//	 * @LastModified 04 05 22
//	 * 
//	 * método para criar connexão com o banco de dados postgresql
//	 */
//	@Bean
//	public void configPgsql()
//	{
//		
//		// working with Entity manager factory e entity manager
//		if(entityManager.isOpen()) {
//			System.out.println(" ---> EntityManagerFactory: Pgsql conn is open");
//		}
//		
//		// working with session factory
//		SessionFactory sessionFactory = entityManager.getEntityManagerFactory().unwrap(SessionFactory.class);
//		
//		sessionConnDB = sessionFactory.openSession();
//		
//		if(sessionFactory.isOpen())
//		{
//			System.out.println("--> SessionFactory: Session factory is open");
//			System.out.println("--> SessionFactory: Fechando session factory ... ");
//			//sessionFactory.close();
//		}
//	}
//	
//	public Session getSession()
//	{
//		return sessionConnDB;
//	}
//}
