package customerManagementSystem;

import java.time.LocalDate;
import javax.*;

import customerManagementSystem.Abstract.BaseCustomerManager;
import customerManagementSystem.Abstract.ICustomerCheckService;
import customerManagementSystem.Adapters.MernisServiceAdapter;
import customerManagementSystem.Concrete.CustomerCheckManager;
import customerManagementSystem.Concrete.NeroCustomerManager;
import customerManagementSystem.Concrete.StarbucksCustomerManager;
import customerManagementSystem.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.firstName = "Ali";
		customer.lastName = "Kara";
		customer.dateOfBirth = LocalDate.of(1978, 11, 11);
		customer.nationalityId = "11221221112";
		
		//ICustomerCheckService iCustomerCheckService = new CustomerCheckManager();;

		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		neroCustomerManager.save(customer);

	}

}
