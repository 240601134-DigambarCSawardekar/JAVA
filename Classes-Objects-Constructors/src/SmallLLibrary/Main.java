package SmallLLibrary;

public class Main {
	public static void main(String[] args) {
		Author a1 = new Author("J.K.Rowling",59,"England");
		Author a2 = new Author("George.R.R.Martin",76,"USA");
		Author a3 = new Author("Stephen King",77,"USA");
		Author a4 = new Author("Chetan Bhagat",46,"India");
		
		Book book1 = new Book("Harry Potter",250, a1);
		Book book2 = new Book("Game of Thrones",250,a2);
		Book book3 = new Book("The Shining",250,a3);
		Book book4 = new Book("Five Point Someone",200,a4);

		
		Library L1 = new Library();
		L1.setBook(book1);
		L1.setBook(book2);
		L1.setBook(book3);
		L1.setBook(book4);

		
		L1.addBook(book1);
		L1.addBook(book2);
		L1.addBook(book3);
		L1.addBook(book4);
		
		L1.displayBooks();
	}

    
	
	

}
