package address;

public class Person {
	String Name;
	Address Address;
	public Person(String Name, Address Address) {
		this.Name = Name;
		this.Address = Address;
	}
	
	
	public String toString() {
		return "Person [Name=" + Name + ", Address=" + Address + "]";
	}
	
	
}
