package payments;

public class CreditCardPayment implements Payments {

	@Override
	public void pay() {
		System.out.println("This Payment was done with a Credit Card.");

	}

}
