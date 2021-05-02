package inheritance;


public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ilknur = new IndividualCustomer();
		ilknur.customerNumber = "12345 ";
	
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910 ";
		
		SyndicateCustomer abc = new SyndicateCustomer();
		abc.customerNumber = "99999 ";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {ilknur, abc, hepsiBurada};
		
		
		customerManager.addMultiple(customers);
		
//		customerManager.add(hepsiBurada);
//		customerManager.add(ilknur);
//		customerManager.add(abc);
		


	}

}
