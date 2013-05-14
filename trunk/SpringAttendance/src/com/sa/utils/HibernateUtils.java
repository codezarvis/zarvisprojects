package com.sa.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static  SessionFactory sessionFactory = null ;
	private static Session session = null;
	
	static {
		try {
			// Create the SessionFactory
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			//throw new ExceptionInInitializerError(ex);
			ex.printStackTrace();
		}
	}

	public static Session currentSession() throws HibernateException {

		session = sessionFactory.openSession();

		return session;
	}

	public static void closeSession() throws HibernateException {

		if (session != null) {
			session.close();
		}

	}
}
