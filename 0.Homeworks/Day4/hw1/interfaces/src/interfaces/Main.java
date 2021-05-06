package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();

	}

}

//Bir class birden fazla interface'i implemente edebilir.
//Ama sadece 1 tane class'ý extend edebilir.

//interface'ler referans tutucudur. Kim kullanacaksa implemente etmesi gerekir.