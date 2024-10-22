package address;

public class Main {
	public static void main(String[] args) {
		Address a1 = new Address("Street No.1","Hyderabad", "Telangana");
		Person p1 = new Person("Degamber",a1);
		System.out.println(p1);
	}
}
