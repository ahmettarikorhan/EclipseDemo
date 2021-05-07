package javacampDay5Hw1.business.concretes;

import javacampDay5Hw1.entities.concretes.User;

public class ValidiatonManager {
	public boolean validateUserPasswordLenght(String password)
	{
		if(password.length() >6) {
			return true;
		}
		System.out.println("Ur password must be above 6 letters");
		return false;
	}
	
	public boolean validateUsernameLenght(String username,String lastname) {
		if(username.length() >2 && lastname.length() >2) {
			return true;
		}
		System.out.println("Username and Password must be above 2 letters");
		return false;
	}
	
	
	public boolean checkEmail(String email) {
		if(UserManager.userEmails.contains(email)) {
			System.out.println("This email already exist");
			return false;
		}
		return true;
	}
	
	

	public boolean validate(User user) {
		if(validateUsernameLenght(user.getFirstName(),user.getLastName()) && 
				validateUserPasswordLenght(user.getPassword()) && isEmailValid(user.getEmail()) && checkEmail(user.getEmail())) {
			return true;
		}
	    System.out.println("Register Unsuccesfully");
		return false;
	}

	private boolean isEmailValid(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}
