package javacampDay5Hw1.dataAccess.abstracts;

import java.util.ArrayList;

import javacampDay5Hw1.entities.concretes.User;

public interface IUserDao {
	void add(User user);
	void delete();
	User get();
	ArrayList<User> getAll();
}
