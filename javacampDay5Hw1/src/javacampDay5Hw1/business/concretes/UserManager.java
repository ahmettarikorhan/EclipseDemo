package javacampDay5Hw1.business.concretes;

import java.util.ArrayList;

import java.util.List;

import javacampDay5Hw1.business.abstracts.IUserService;

public class UserManager implements IUserService{
	
	static List<String> userEmails = new ArrayList<String>() ;

	@Override
	public void register(String firstName, String lastname, String email, String password) {
		System.out.println("User registered:" + firstName);
		userEmails.add(email);
	}

	@Override
	public void login(String email, String password) {
		System.out.println("Login succesfully !"+"\t"+email+";"+password);
		
	}

}
