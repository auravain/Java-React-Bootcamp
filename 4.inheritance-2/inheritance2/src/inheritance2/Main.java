package inheritance2;


public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger());
	}


}

//birbirinin alternatifi olan kodlar i�in "if" yaz�lmaz.