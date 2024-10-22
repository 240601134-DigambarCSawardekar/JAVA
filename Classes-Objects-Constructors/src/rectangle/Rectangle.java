package rectangle;

public class Rectangle {
	int length;
	int width;
	
	Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	public int area() {
		int Area = length*width;
		
		return Area;
	}
	
	public int perimeter() {
		int Perimeter = 2*(length+width);
		
		return Perimeter;
	}

}
