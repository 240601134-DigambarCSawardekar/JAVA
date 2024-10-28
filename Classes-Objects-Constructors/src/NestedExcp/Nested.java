package NestedExcp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		if(a<0) {
			throw new Negative("Negitive Numbers Not Allowed");
		}
		System.out.print("Valid Integer : " + a);
		}
		catch(Negative e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input Type !");
		}
	}
}
