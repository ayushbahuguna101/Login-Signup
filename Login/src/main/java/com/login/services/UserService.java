package com.login.services;

import com.login.models.NewUser;
import com.login.models.User;

public interface UserService {
	
	boolean validateUser(User user);
	void addNewUser(NewUser newUser);
}
