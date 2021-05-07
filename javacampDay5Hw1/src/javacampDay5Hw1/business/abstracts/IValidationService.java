package javacampDay5Hw1.business.abstracts;

import javacampDay5Hw1.entities.concretes.User;

public interface IValidationService {
	boolean validate(User user);
}
