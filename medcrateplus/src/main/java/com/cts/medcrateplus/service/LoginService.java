package com.cts.medcrateplus.service;

import com.cts.medcrateplus.bean.Login;

public interface LoginService {

	public String getUserType(String userId);
	public Login authenticate(String userName, String password);
}
