package com.cts.medcrateplus.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.medcrateplus.bean.Login;





@Repository("loginDAO")
@Transactional
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	//@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Transactional(readOnly=true)
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		org.hibernate.Session session = null;
		String query = "from Login where userId=? and password=?";
		org.hibernate.query.Query<Login> query2 = null;
		Login login=new Login(userName, password);
		if(login==null){
			return null;
		}
		else{
		
		
		try {
			session = sessionFactory.getCurrentSession();
			
			query2 = session.createQuery(query);
			query2.setParameter(0, login.getUserId());
			query2.setParameter(1, login.getPassword());
			 login = query2.getSingleResult();
			 System.out.println("aa");
			return login;
			// TODO: handle exception
			
		}
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		System.out.println("User not found");
		return null;
		
		}
		
		finally {
			
		}
		
	}}
	@Override
	public String getUserType(String userId) {
		// TODO Auto-generated method stub
		Session session = null;
		String query = "select userType from Login where userId=?";
		org.hibernate.query.Query<String> query2 = null;
		session = sessionFactory.getCurrentSession();
		query2 = session.createQuery(query);
		query2.setParameter(0, userId);
		String s = query2.getSingleResult();
		return s;
	}
	
}