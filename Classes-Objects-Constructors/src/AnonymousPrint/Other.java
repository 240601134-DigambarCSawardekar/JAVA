package AnonymousPrint;

public class Other {
	public void createPrint() {
		Print p = new Print() {
		
			@Override
			public void printMessage() {
				System.out.println("Print.");
			}
			
		};
	p.printMessage();
	}
	public static void main(String[] args) {
		Other o = new Other();
		o.createPrint();
	}
}
