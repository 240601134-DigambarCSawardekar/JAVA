package SmallLLibrary;

public class Book {
	String title;
	int price;
	Author author;

	
	Book(String title, int price,Author author) {
		this.title = title;
		this.price = price;
		this.author = author;
		
	}


	public void displayInfo() {
		System.out.print("Title of Book : "+ title + "|| Price of book : "+ price + "|| Author of book : "+ author.getName() + ".");
		
	}
	
}
