class Customer {
	constructor(id, customerNumber) {
		this.id = id;
		this.customerNumber = customerNumber;
	}
}

let customer = new Customer(1, '12345');
//*prototyping
customer.name = 'İlknur Sucaklı'; //instance'a yapılan prototyping.
console.log(customer.name);

Customer.bisey = 'Bişey'; //class'a yapılan prototyping.
console.log(Customer.bisey);

console.log(customer.customerNumber);

class IndividualCustomer extends Customer {
	constructor(firstName, id, customerNumber) {
		super(id, customerNumber);
		this.firstName = firstName;
	}
}
class CorporateCustomer extends Customer {
	constructor(companyName, id, customerNumber) {
		super(id, customerNumber);
		this.companyName = companyName;
	}
}
