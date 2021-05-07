package javacampDay5Hw1.dataAccess.concretes;


import java.util.List;
import java.util.ArrayList;

import javacampDay5Hw1.dataAccess.abstracts.IUserDao;
import javacampDay5Hw1.entities.concretes.User;

public class UserDao implements IUserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Database Üzerine Eklendi");
		users.add(user);
		
	}
	
	public boolean checkMailanPassword(String email, String password) {
		for (User user : users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
