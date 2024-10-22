package calculator;

public class Calculator {
	double num1;
	double num2;
	
	Calculator(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void addition() {
		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
	}
	
	public void substraction() {
		System.out.println("Substraction of "+num1+" and "+num2+" is "+(num1-num2));
	}
	
	public void multiplication() {
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
	}
	
	public void division() {
		System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
	}
	
	public void modulus() {
		System.out.println("Modulus of "+num1+" and "+num2+" is "+(num1%num2));
	}
	
}
