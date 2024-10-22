package bank;
import java.util.Scanner;


public class BankAcc {
	Scanner Scan = new Scanner(System.in);
	private int AccNo;
	private String AccType;
	private double Balance;
	private static double InterestRate;
	
	static {
		InterestRate = 7.25;
	}
	
	BankAcc(int AccNo, String AccType, double Balance){
		this.AccNo = AccNo;
		this.AccType = AccType;
		this.Balance = Balance;
	}
	
	public void display() {
		System.out.println("For Account Number "+AccNo+" Account Type is "+AccType+" and Balance is "+Balance+".");
	}
	
	public void transaction() {
			int n = 0;
		while(n != 3){
			System.out.println("Select an Option \n1.Withdraw \n2.Deposit \n3.Stop");
			n = Scan.nextInt();
		switch(n) {
		case 1 :
			System.out.println("Enter an Amount to Withdraw : ");
			double Amt = Scan.nextInt();
			
			Balance = Balance - Amt;
			System.out.println("Update Balance is "+Balance);
			
			break;
			
		case 2:
			System.out.println("Enter an Amount to Deposit : ");
			double Amt1 = Scan.nextInt();
			
			Balance = Balance+Amt1;
			System.out.println("Updated Balance is "+Balance);
			
			break;
			
		case 3:
			System.out.println("Thank You for your Buisness.");
			break;
		
		default : 
			System.out.println("Invalid Option.");
			}
		}

	}
	
	public static void interest(BankAcc a) {
		double IntAmt;
		IntAmt = a.Balance*(InterestRate/100);
		System.out.println("Interest calculated for a year is "+IntAmt);
	}
	
	
}
