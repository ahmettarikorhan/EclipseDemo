package javacampDay5Hw1.business.concretes;

import javacampDay5Hw1.business.abstracts.IEmailService;
import javacampDay5Hw1.business.abstracts.IUserService;
import javacampDay5Hw1.business.abstracts.IValidationService;
import javacampDay5Hw1.dataAccess.concretes.UserDao;
import javacampDay5Hw1.entities.concretes.User;

public class AuthManager {
	IUserService userService;
	IValidationService validatinService;
	IEmailService emailService;
	UserDao userDao;
	
	
	public AuthManager(IUserService userService, ValidiatonManager validiatonManager, IEmailService emailService,
			UserDao userDao) {
		super();
		this.userService = userService;
		//this.validatinService = validiatonManager;
		this.emailService = emailService;
		this.userDao = userDao;
	}
	
	public AuthManager(UserManager userService2, ValidiatonManager validiatonManager, EmailManager emailService2,
			UserDao userDao2) {
		// TODO Auto-generated constructor stub
	}

	public void login(String email, String password) {
		if(email.length() ==0  || password.length() == 0) {
			System.out.println("fill in the blanks");
			return;
		}
		if(userDao.checkMailanPassword(email, password)) {
			userService.login(email, password);
		}else {
			System.out.println("Wrong password or email");
		}
		
		
		
		
		
		
	}


	public void register(String firstName, String lastName, String email, String password) {
		IValidationService validationService = null;
		if (validationService.validate(new User(0, firstName, lastName, email, password))) {
			userService.register(firstName, lastName, email, password);
			User UserToRegister = new User(0, firstName, lastName, email, password);
			userDao.add(UserToRegister);
			emailService.send("Dogrulama linki gonderildi "+UserToRegister.getEmail()+" kontrol ediniz.");
			
		}
		
	}
	
}
