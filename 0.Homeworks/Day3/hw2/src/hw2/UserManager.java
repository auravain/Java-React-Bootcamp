package hw2;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� Eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� G�ncellendi: " + user.getFirstName() + " " + user.getLastName());
	}

}
