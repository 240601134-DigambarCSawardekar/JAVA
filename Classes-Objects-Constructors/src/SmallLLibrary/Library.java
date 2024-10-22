package SmallLLibrary;

public class Library {
	Book book1;
	Book book2;
	Book book3;

public void addBook1(Book book) {
	this.book1 = book;
}

public void addBook2(Book book) {
	this.book2 = book;
}

public void addBook3(Book book) {
	this.book3 = book;
}
	
	
public void displayBooks() {
        if (book1 != null) {
            book1.displayInfo();
        }
        System.out.println();
        if (book2 != null) {
            book2.displayInfo();
        }
        System.out.println();
        if (book3 != null) {
            book3.displayInfo();
        }

	
	}
}
