package MethodSpecialization;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setData("Ronnie", 24, 252535, "Josie Colony", 20000.0, "CSE");
		e.getData();
		e.printSalary();
		
		Manager m = new Manager();
		m.setData("Ronnie", 24, 252535, "Josie Colony", 20000.0, "C-DAC");
		m.getData();
		m.printSalary();

	}

}
