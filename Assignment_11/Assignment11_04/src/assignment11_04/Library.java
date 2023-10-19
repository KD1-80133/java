/*Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
and descendingIterator().*/
package assignment11_04;
import java.util.*;
public class Library {

	public static void main(String[] args) {
		
		class BookComparator implements Comparator<Book>
		{
			@Override
			public int compare(Book b1, Book b2) {
				int diff= Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		BookComparator isbnComparator = new BookComparator();		
		
		TreeSet<Book> set =new TreeSet<>(isbnComparator);
		set.add(new Book("1",200.0,"Akanksha",10));
		set.add(new Book("2",650.0,"Manav",50));
		set.add(new Book("7",290.0,"Zikra",40));
		set.add(new Book("4",450.0,"Anita",20));
		set.add(new Book("6",980.0,"Naheen",60));
		set.add(new Book("9",2221.0,"Dinesh",70));
		set.add(new Book("1",330.0,"Akanksha",50));
		
		
		Iterator<Book> Iterator=set.iterator();
		while(Iterator.hasNext())
		{
			Book ele=Iterator.next();
			System.out.println(ele);
		}
		
		System.out.println("---------------------------");
		System.out.print("Iterate in Descending order:\n ");
		Iterator<Book> itr = set.descendingIterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.print(b +"\n");
		}
	}
		
		
}

