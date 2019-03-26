package com.cts.medcrateplus.dao;

import com.cts.medcrateplus.bean.Login;

public interface LoginDAO {

	public String getUserType(String userId);
	public Login authenticate(String userName, String password);
}
