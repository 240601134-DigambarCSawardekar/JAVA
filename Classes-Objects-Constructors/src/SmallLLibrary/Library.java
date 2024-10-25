package SmallLLibrary;

import java.util.ArrayList;

	public class Library {
		Book book;
		
	
		ArrayList <Book> Books = new ArrayList<Book>();
	
	public void setBook(Book book) {
			this.book = book;
			}
	public void addBook(Book book) {
		Books.add(book);
	}
		
	
	public void displayBooks() {
		for(Book book: Books) {
			System.out.println("For Book Title "+book.title+" Author is "+book.author.getName()+".");
		}
		
        }	
}

