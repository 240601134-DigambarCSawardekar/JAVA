package applianceAbstract;

public class Microwave extends Appliance {
	
	Microwave(String brand,double powerConsumption){
		this.brand = brand;
		this.powerConsumption = powerConsumption;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Brand of Microwave is "+brand+".");
		System.out.println("Power Consumption of Microwave is "+powerConsumption+".");

	}

}
