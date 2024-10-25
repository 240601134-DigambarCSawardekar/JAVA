package AnonymousShape;

public class Other{
	
	public void createShape() {
	
	Shape s = new Shape(){

		@Override
		void draw() {
			System.out.println("Draw...");
			
		}
     };
     s.draw();
	}
	
	public static void main(String[] args) {
		Other o = new Other();
		o.createShape();
	

}
}

