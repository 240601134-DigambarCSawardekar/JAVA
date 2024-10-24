package SingleInheritance;

public class Person {
	String name;
	int age;
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getData() {
		System.out.println(name + " " + age);
	}
	
	
}
