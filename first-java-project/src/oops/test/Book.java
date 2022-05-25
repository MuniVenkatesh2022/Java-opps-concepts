package oops.test;

public class Book {
	private int bookId;
	private String bookName;
	private String bookCategory;
	private String bookAuthor;
	private double bookPrice;
	
	
	public Book() {
		System.out.println("Default constructed calling...");
	}
	
	
	public Book(int bookId, String bookName, String bookCategory, String bookAuthor, double bookPrice) {
		this();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		displayBookInfo(this);//this as a parameter
	}
	
	public void displayBookInfo(Book b) {
		System.out.println(b.bookId+" "+b.bookName+" "+b.bookCategory+" "+b.bookAuthor+" "+b.bookPrice);
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCategory=" + bookCategory + ", bookAuthor="
				+ bookAuthor + ", bookPrice=" + bookPrice + "]";
	}


	public static void main(String[] args) {
		Book b=new Book(21,"sdfk","dfw","skjfa",45.56);
		System.out.println(b);
	}

}
