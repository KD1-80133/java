package assignment11_04;

public class Book implements Comparable<Book> {

		private String isbn;
	    private double price;
	    private String authorName;
	    private int quantity;
	    
	    public Book() {
			// TODO Auto-generated constructor stub
		}

		public Book(String isbn, double price, String authorName, int quantity) {
			this.isbn = isbn;
			this.price = price;
			this.authorName = authorName;
			this.quantity = quantity;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
					+ "]";
		}

		public int compareTo(Book other)
		{
			int diff=this.getIsbn().compareTo(other.getIsbn());
			return diff;
		}
		
}



