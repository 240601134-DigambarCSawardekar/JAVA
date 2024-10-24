package vehicle;


public interface Vehicle {
	
	public default void startEngine() {
		System.out.println("Engine Started.");
	}

}

