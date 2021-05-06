package interfaceAbstractDemo.concrete;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.ICustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		super();
		this.iCustomerCheckService = iCustomerCheckService;
	}

	private ICustomerCheckService iCustomerCheckService;
	
	@Override
	public void save(Customer customer) {
		
		if(iCustomerCheckService.CheckIfRealPerson(customer)) {
			
			this.save(customer);
			System.out.println("Person verified");
			
		}else {
			
			System.out.println("Not a valid person");
			
		}
		
	}
}
