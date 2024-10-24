package applianceAbstract;

public class WashingMachine extends Appliance {
	
	WashingMachine(String brand,Double powerConsumption){
		this.brand = brand;
		this.powerConsumption= powerConsumption;
	}
	@Override
	public void turnOn() {
		System.out.println("Brand of Washing Machine is "+brand+".");
		System.out.println("Power Consumption of Washing Machine is "+powerConsumption+".");

	}

}
