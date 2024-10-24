package shapeAbstract;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle(12.45);
		Rectangle r1 = new Rectangle(10, 20);
		
		System.out.println("Area of Circle is "+c1.area()+".");
		System.out.println("Area of Rectangle is "+r1.area()+".");

	}

}
