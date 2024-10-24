package MethodSpecialization;

public class Manager extends Member {
	String Department;
	
	public void setData(String Name,int Age,int Phone,String Address,
			Double Salary,String Department) {
			this.Name = Name;
			this.Age = Age;
			this.Address = Address;
			this.Salary = Salary;
			this.Phone = Phone;
			this.Department = Department;
		}
	public void getData() {
		System.out.println(Name + " " + Age+" "+Address+" "+ Salary + " "+Phone+" "+ Department);
	}
}
