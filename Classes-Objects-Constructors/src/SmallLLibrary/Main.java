package SmallLLibrary;

public class Main {
	public static void main(String[] args) {
		Author a1 = new Author("J.K.Rowling",59,"England");
		Author a2 = new Author("George.R.R.Martin",76,"USA");
		Author a3 = new Author("Stephen King",77,"USA");
		
		Book book1 = new Book("Harry Potter",250, a1);
		Book book2 = new Book("Game of Thrones",250,a2);
		Book book3 = new Book("The Shining",250,a3);
		Library L1 = new Library();
		
		L1.addBook1(book1);
		L1.addBook2(book2);
		L1.addBook3(book3);
		
		L1.displayBooks();
	}

    
	
	

}
