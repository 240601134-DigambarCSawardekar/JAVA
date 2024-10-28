package ZeroException;
import java.util.Scanner;

public class Zero {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			try {
				System.out.print("Enter the first Value : ");
				int a = sc.nextInt();
				System.out.print("Enter the Second Value : ");
				int b = sc.nextInt();
				int c = a / b;
				System.out.println("value of c:"+ c);
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero");
			} finally {
				System.out.println("Finally Rest of code will run..");
			}
		}
	}
}
