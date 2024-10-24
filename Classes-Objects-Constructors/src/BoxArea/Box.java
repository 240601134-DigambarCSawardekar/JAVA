package BoxArea;

public class Box {
	double length;
	double width;
	double height;
	
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return 2*(length*width+width*height+height*length);
	}
}
