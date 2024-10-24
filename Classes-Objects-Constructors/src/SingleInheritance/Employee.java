package SingleInheritance;

public class Employee extends Person{
	String EmployeeId;
	double Salary;
	 
	public void setData(String name, int age,String EmployeeId,double Salary) {
		super.setData(name, age);
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
	}
	@Override
	public void getData() {
		super.getData();
		System.out.println(EmployeeId + " " + Salary);
	}
}
