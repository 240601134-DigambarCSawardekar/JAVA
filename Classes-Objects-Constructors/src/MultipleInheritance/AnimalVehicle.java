package MultipleInheritance;

public class AnimalVehicle {
	private Animal animal;
	private Vehicle vehicle;
	
	public AnimalVehicle() {
		animal = new Animal();
		vehicle = new Vehicle();
	}
	
	public void eat() {
		animal.eat();
	}
	
	public void drive() {
		vehicle.drive();
	}
}
