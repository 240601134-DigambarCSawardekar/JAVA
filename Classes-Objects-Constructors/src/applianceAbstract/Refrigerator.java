package applianceAbstract;

public class Refrigerator extends Appliance {
	
	Refrigerator(String brand,double powerConsumption){
		this.brand = brand;
		this.powerConsumption = powerConsumption;
	}

	@Override
	public void turnOn() {
		System.out.println("Brand of Refrigerator is "+brand+".");
		System.out.println("Power Consumption of Refrigerator is "+powerConsumption+".");

	}

}
