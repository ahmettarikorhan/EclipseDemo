package com.mythredd.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mythredd.hrms.business.abstracts.UserService;
import com.mythredd.hrms.dataAccess.abstracts.UserDao;
import com.mythredd.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
