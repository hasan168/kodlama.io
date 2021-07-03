package taskday3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstname() + " Kullan�c� bilgisi eklendi.");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void update(User user) {
		System.out.println(user.getFirstname() + " Kullan�c� bilgisi g�ncellendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstname() + " Kullan�c� bilgisi silindi.");
	}

}
