package applianceAbstract;

public class Main {

	public static void main(String[] args) {
		WashingMachine w1 = new WashingMachine("Samsung", 1800.00);
		Refrigerator r1 = new Refrigerator("Hitachi", 1500.00);
		Microwave m1 = new Microwave("Godrej", 800.00);
		
		w1.turnOn();
		r1.turnOn();
		m1.turnOn();
		

	}

}
