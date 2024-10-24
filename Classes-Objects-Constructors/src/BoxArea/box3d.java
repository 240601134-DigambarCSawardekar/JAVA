package BoxArea;

public class box3d extends Box {

	public box3d(double length, double width, double height) {
		super(length, width, height);
		
	}
	
	
	 
	public double volume() {
		return length*width*height;
		 
	}

}

 