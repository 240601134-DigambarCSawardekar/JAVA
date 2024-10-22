package person;

public class Person {
	private String Name;
	private int Age;
	private static String Country = "India";
	
	Person(String N, int A){
		this.Name = N;
		this.Age = A;
	}
	
	public void getdata() {
		System.out.println("Name is "+ Name);
		System.out.println("Age is "+ Age);
		System.out.println("Country is "+Country);
	}
	
	public static void compare(Person a,Person b) {
		if(a.Age < b.Age) {
			System.out.println(a.Name+" is Younger than "+b.Name);
		}
		else if(a.Age > b.Age) {
			System.out.println(b.Name+" is Younger than "+a.Name);
		}
		else if(a.Age == b.Age) {
			System.out.println(a.Name+" and "+b.Name+" are of same Age.");
		}
	}
}
