package assignment9_04;
import java.util.*;

class Book {
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
	public void acceptData() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter ISBN: ");
	    isbn = scanner.next();
	    System.out.print("Enter Price: ");
	    price = scanner.nextDouble();
	    System.out.print("Enter Author Name: ");
	    authorName = scanner.next();
	    System.out.print("Enter Quantity: ");
	    quantity = scanner.nextInt();
	}
	public boolean equals(Object obj)
	{
		if (this == obj) {
	        return true;
	    }
	    if (obj == null) {
	        return false; 
	    }
	    if(getClass() != obj.getClass())
	    	return false;
		Book other=(Book)obj;
		if(this.isbn.equals(other.isbn));
		   return Objects.equals(isbn, other.isbn);
	}
}
public class Library {
	public static void main(String[] args) {
	List<Book> list=new ArrayList<>();

	
	int choice;
	
	do {
		System.out.println("--------Library System----------");
		System.out.println("1.Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index.");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list.");
		System.out.println("7.Sort all books by price in desc order");
		System.out.println("8.Exit");
		System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        choice=scanner.nextInt();
        
        
		switch(choice)
        {
        case 1:
        	Book book=new Book();
        	book.acceptData();
        	list.add(book);
        	System.out.println("Book added to list.");
        	break;
        case 2:
        	for (Book book1 : list)
        	{
        		System.out.println(book1);
        	}
        	break;
        case 3:
        	 System.out.println("Enter the index to delete:");
        	    int index = scanner.nextInt();
        	    if (index >= 0 && index < list.size()) {
        	        list.remove(index);
        	        System.out.println("Book removed successfully.");
        	    } else {
        	        System.out.println("Invalid index. The list size is " + list.size() + ".");
        	    }
        	    break;
        case 4:
        	Book key=new Book();
        	String isbn=scanner.next();
        	key.setIsbn(isbn);
        	if(list.contains(key))
        		System.out.println("Found");
        	else
        		System.out.println("Not found");
        	break;
        case 5:
        	list.clear();
            System.out.println("All books removed from the list.");
            break;
        case 6:
        	System.out.println("Number of books in the list: " + list.size());
            break;
        case 7:
        	class BookPriceComparator implements Comparator<Book>
        	{
        			@Override
        			public int compare(Book b1, Book b2) {
        				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
        				return diff;
        			}
        	}
        	BookPriceComparator Comparator=new BookPriceComparator();
        	list.sort(Comparator);
        	break;
        case 8:
        	System.out.println("Exiting the library system.");
            break;
        	
        default:
            System.out.println("Invalid choice. Please enter a valid option.");
        }
		
        } while (choice != 8);
       
	}
	

}
