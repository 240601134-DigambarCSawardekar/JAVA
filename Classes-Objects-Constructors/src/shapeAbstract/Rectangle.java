package shapeAbstract;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		double Area = length*width;
		
		return Area;
	}

}
