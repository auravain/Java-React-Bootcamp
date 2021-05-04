package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
	}

}

//loosly - tightly coupled
//public void add(Customer customer) {
	//System.out.println("Müþteri eklendi: " + customer.getFirstName());

	//Kötü kod:
	//DatabaseLogger logger = new DatabaseLogger();
	//logger.log(customer.getFirstName() + " veri tabanýna loglandý.");
//}

//public void delete(Customer customer) {
	//System.out.println("Müþteri silindi: " + customer.getFirstName());
	
	//kötü kod:
	//DatabaseLogger logger = new DatabaseLogger();
	//logger.log(customer.getFirstName() + " veri tabanýna loglandý.");
//}
