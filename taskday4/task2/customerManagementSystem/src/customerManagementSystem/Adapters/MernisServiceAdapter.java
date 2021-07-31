package customerManagementSystem.Adapters;

import java.rmi.RemoteException;

import customerManagementSystem.Abstract.ICustomerCheckService;
import customerManagementSystem.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		boolean result;
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(),
					customer.lastName.toUpperCase(), customer.dateOfBirth.getYear());
		} catch (RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		return result;

	}

}
