package InvocConstructor;

public class Employee extends Person{ 
	String EmployeeId;
	Double Salary;
	
	public Employee(String name, int age, String EmployeeId, Double Salary) {
		super(name, age);
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
		System.out.println("Employee Constuctor Calls.");
	}
	
	 

	public void display() {
		System.out.println(name+" "+age+" "+EmployeeId+" "+Salary);
	}
	
}
