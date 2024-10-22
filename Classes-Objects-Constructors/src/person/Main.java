package person;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Digambar",24);
		Person p2 = new Person("Dhruv",21);
		
		p1.getdata();
		p2.getdata();
		
		Person.compare(p1,p2);

	}

}
