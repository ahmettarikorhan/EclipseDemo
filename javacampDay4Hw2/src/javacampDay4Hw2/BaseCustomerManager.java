package javacampDay4Hw2;



public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public  void Save(Customer customer) {
		System.out.println("Saved to db : " + customer.firstName);
		
	}

}
