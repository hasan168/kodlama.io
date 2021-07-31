package customerManagementSystem.Concrete;

import customerManagementSystem.Abstract.ICustomerCheckService;
import customerManagementSystem.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;		
	}


}
