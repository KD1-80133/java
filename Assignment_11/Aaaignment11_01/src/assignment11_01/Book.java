package assignment11_01;

import java.util.*;
public class Book {

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

		
		public int hashCode() {
			int hash=Objects.hash(this.isbn);
			return hash;
		}

		
		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			if (this==obj)
				return true;
			if (obj instanceof Book)
			{
				Book other =(Book) obj;
				if(this.isbn==other.isbn)
					return true;
			}
			return false;
		}
		
}



