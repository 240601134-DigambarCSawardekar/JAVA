package MethodSpecialization;

public class Employee extends Member{
	String Specialization;
	 
	
	public void setData(String Name,int Age,int Phone,String Address,
		Double Salary,String Specialization) {
		this.Name = Name;
		this.Age = Age;
		this.Address = Address;
		this.Salary = Salary;
		this.Phone = Phone;
		this.Specialization = Specialization;
	}
	
	public void getData() {
		System.out.println(Name + " " + Age+" "+Address+" "+ Salary + " "+Phone+" "+ Specialization);
	}
}
