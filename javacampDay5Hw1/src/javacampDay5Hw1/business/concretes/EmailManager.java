package javacampDay5Hw1.business.concretes;

import javacampDay5Hw1.business.abstracts.IEmailService;

public class EmailManager implements IEmailService{
	public void send(String message) {
		System.out.println("Message sent : " + message);
	}
}
