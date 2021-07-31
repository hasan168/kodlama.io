package customerManagementSystem.Abstract;

import customerManagementSystem.Entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
