package customerManagementSystem.Concrete;

import customerManagementSystem.Abstract.BaseCustomerManager;
import customerManagementSystem.Abstract.ICustomerCheckService;
import customerManagementSystem.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;

	public NeroCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
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
}
