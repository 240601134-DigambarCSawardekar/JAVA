package bank;

public class Main {

	public static void main(String[] args) {
		
		BankAcc b1 = new BankAcc(1411001, "Savings", 240559.21);
		
		b1.display();
		b1.transaction();
		BankAcc.interest(b1);
		
	}

}
