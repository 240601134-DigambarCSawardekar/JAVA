package shape;

public class Circle implements Colorful {
	
	private double radius;
	private String color;
	private static double pi = 3.14;
	
	Circle(double radius,String color){
		this.color = color;
		this.radius = radius;
		
	}

	@Override
	public void draw() {
		System.out.println("Draw a Circle with Radius "+radius+".");

	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Circle is "+(2*pi*radius)+".");

	}

	@Override
	public void fillColor() {
		System.out.println("The Circle is Filled with "+color+" Color.");

	}

}
