package com.login.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.dao.LoginDao;
import com.login.models.NewUser;
import com.login.models.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean validateUser(User user) {
		System.out.println("validateUser is working");
		return this.loginDao.checkingCredentials(user);
	}

	@Override
	public void addNewUser(NewUser newUser) {
		System.out.println("saveUser is working");
		System.out.println(newUser);
		this.loginDao.saveDetails(newUser);
	}

}
