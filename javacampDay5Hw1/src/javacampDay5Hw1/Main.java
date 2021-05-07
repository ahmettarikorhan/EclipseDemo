package javacampDay5Hw1;

import javacampDay5Hw1.business.concretes.ValidiatonManager;
import javacampDay5Hw1.dataAccess.concretes.UserDao;
import javacampDay5Hw1.business.concretes.AuthManager;
import javacampDay5Hw1.business.concretes.EmailManager;
import javacampDay5Hw1.business.concretes.UserManager;

public class Main {

	public static void main(String[] args) {
		IAuthService authService = (IAuthService) new AuthManager(new UserManager(),null, new EmailManager(),new UserDao());
		
		authService.register("Ahmet", "Tarýk", "deneme@mail.com", "123456");
		authService.login("deneme@mail.com", "123456");
	}
	
	
	
}
