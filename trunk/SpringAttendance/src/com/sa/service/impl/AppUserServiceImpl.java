package com.sa.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sa.domain.sub.AppUser;
import com.sa.service.AppUserService;
import com.sa.utils.HibernateUtils;

public class AppUserServiceImpl extends ServiceImpl implements AppUserService {


	private static AppUserServiceImpl appUserServiceImpl = new AppUserServiceImpl();

	private AppUserServiceImpl() {
	}

	public static AppUserService getInstance() {
		return appUserServiceImpl;
	}


	@Override
	public void create(AppUser appUser) {

		Session session = HibernateUtils.currentSession();

		Transaction tx = null;

		boolean rollBack = true;

		try{

			tx = session.beginTransaction();
			session.saveOrUpdate(appUser);
			tx.commit();
			System.out.println("user Created");
			rollBack = false;


		}catch (Exception e) {

			e.printStackTrace();	
			HibernateUtils.closeSession();

		}finally{

			if(rollBack && tx != null){

				tx.rollback();
				HibernateUtils.closeSession();

			}
		}


	}

	@Override
	public List<AppUser> getAll() {
		return null;
	}

	@Override
	public AppUser authenticate(String userName, String password) {

		Session session = HibernateUtils.currentSession();
		AppUser appUser = null;
		try {
			Query query = session
					.createQuery("from AppUser appUser where userName=:userName and password=:password");

			query.setParameter("userName", userName);
			query.setParameter("password", password);


			appUser = (AppUser) query.uniqueResult();

		}catch (Exception e) {

		}finally {
			HibernateUtils.closeSession();
		}

		return appUser;
	}

	@Override
	public AppUser forgotPassword(String userName,String securityQuestion, String answer
			) {
		Session session = HibernateUtils.currentSession();
		AppUser appUser = null;
		try {
			Query query = session
					.createQuery("from AppUser appUser where userName=:userName and securityQuestion=:securityQuestion and answer=:answer");
			
			
			query.setParameter("userName", userName);
			query.setParameter("securityQuestion", securityQuestion);
			query.setParameter("answer", answer);
			



			appUser = (AppUser) query.uniqueResult();

		}catch (Exception e) {

		}finally {
			HibernateUtils.closeSession();
		}

		return appUser;
	}
	@Override
	public AppUser findByUserName(String userName) {
		return null;
	}

	@Override
	public int changePassword(String userName, String password,
			String answer) {

		System.out.println("appuserimpl");
		Transaction tx = null;
		int i = 0;
		Session session = HibernateUtils.currentSession();
		tx = session.beginTransaction();

		try {

			Query query = session
					.createQuery("UPDATE AppUser appUser set password=:answer where userName=:userName and password =:password ");

			query.setParameter("answer", answer);
			query.setParameter("userName", userName);
			query.setParameter("password", password);

			i = query.executeUpdate(); 
			tx.commit();


		}catch (Exception e) {

		}finally {
			HibernateUtils.closeSession();
		}

		return i;
	}

}
