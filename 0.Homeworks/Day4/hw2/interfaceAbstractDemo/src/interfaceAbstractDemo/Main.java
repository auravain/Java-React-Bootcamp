package interfaceAbstractDemo;

import java.time.LocalDate;


import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Ýlknur", "Sucaklý", LocalDate.of(1994, 12, 7), "59116388786"));
	}

}
