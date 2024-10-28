package ArrayOutOfBond;

public class Index {
	public static void main(String[] args) {
		
		try {
		int arr[] = {1,2,3,4};
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound");
		}
		finally {
			System.out.println("Finally rest of code will run..");
		}
	}

}
