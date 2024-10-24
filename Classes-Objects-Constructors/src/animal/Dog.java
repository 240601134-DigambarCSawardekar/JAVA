package animal;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Woof-Woof");
		
	}

	@Override
	public void eat() {
		System.out.println("Pedigree");

	}

}
