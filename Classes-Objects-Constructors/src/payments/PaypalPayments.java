package payments;

public class PaypalPayments implements Payments {

	@Override
	public void pay() {
		System.out.println("This Payment was done with Paypal.");

	}

}
