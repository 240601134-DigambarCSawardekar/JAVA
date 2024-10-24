package SingleInheritance;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setData("Rakesh", 1000);
		p.getData();
		
		Employee e = new Employee();
		e.setData("Digamber", 20000, "E1a",200);
		e.getData();

	}

}
