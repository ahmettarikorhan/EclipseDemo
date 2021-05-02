package javacampDay4Hw2;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new BaseCustomerManager() {
		};
		
		Customer ahmet = new Customer();
		ahmet.firstName = "Ahmet";
		ahmet.dateOfBirth = "2006";
		ahmet.id = 1;
		ahmet.lastName = "orhan";
		ahmet.nationaltyId = "1000000000";
		
		
		customerManager.Save(ahmet);

	}
	
	

}
