package animal;

public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Meow");

	}

	@Override
	public void eat() {
		System.out.println("Whiskas");

	}

}
