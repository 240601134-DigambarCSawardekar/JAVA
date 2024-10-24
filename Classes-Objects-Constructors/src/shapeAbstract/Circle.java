package shapeAbstract;

public class Circle extends Shape {
	private double radius;
	private static double pi = 3.14;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double Area = 2*pi*radius;
		
		return Area;
	}

}
