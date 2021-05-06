package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
