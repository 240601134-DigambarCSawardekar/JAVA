package address;

public class Address {
	String Street;
	String City;
	String State;
	
	Address(String Street, String City, String State) {
		this.Street = Street;
		this.City = City;
		this.State = State;
	}

	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", State=" + State + "]";
	}

	
}