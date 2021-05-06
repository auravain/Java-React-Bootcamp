package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.ICustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.nationaltyId), customer.firstName.toUpperCase(), 
					customer.lastName.toUpperCase(), customer.DAteOfBirth.getYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}

}
