package com.cts.medcrateplus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.medcrateplus.bean.Login;
import com.cts.medcrateplus.dao.LoginDAO;

@Service("loginService")
@Transactional(propagation=Propagation.SUPPORTS)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDAO loginDAO ;

	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(userName, password);
	}

	@Override
	public String getUserType(String userId) {
		// TODO Auto-generated method stub
		return loginDAO.getUserType(userId);
	}
	
}
