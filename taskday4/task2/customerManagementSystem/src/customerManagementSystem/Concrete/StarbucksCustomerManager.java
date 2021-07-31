package customerManagementSystem.Concrete;

import customerManagementSystem.Abstract.BaseCustomerManager;
import customerManagementSystem.Abstract.ICustomerCheckService;
import customerManagementSystem.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			throw new IllegalArgumentException("Not a valid person");
		}
	}

	// private void CheckIfRealPerson(Customer customer) {
	// }

}
