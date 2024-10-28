package CustomException;
import java.util.Scanner;
public class Custom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int a = sc.nextInt();
		try {
		if(a<0 || a>120){
			throw new CustomExcp("Invalid age!");
			} 
		System.out.println("Valid age entered: " + a);
		}
		catch(CustomExcp e) {
			System.out.println(e.getMessage());
		}
		
	}
}
