package payments;

public class Main {

	public static void main(String[] args) {
		CreditCardPayment c1 = new CreditCardPayment();
		PaypalPayments p1 = new PaypalPayments();
		
		c1.pay();
		p1.pay();

	}

}
