package com.login.dao;

import com.login.models.NewUser;
import com.login.models.User;

public interface LoginDao {
	
	boolean checkingCredentials(User user);
	void saveDetails(NewUser newUser);
	
}
