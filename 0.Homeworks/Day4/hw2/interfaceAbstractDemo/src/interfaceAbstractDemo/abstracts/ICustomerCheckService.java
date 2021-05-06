package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;


public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer);
	
}
