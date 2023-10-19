/*In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
Books are stored in which order?*/
package assignment11_03;
import java.util.*;
public class Library {

	public static void main(String[] args) {
		Set<Book> set =new TreeSet<>();
		set.add(new Book("1",200.0,"Akanksha",10));
		set.add(new Book("2",650.0,"Manav",50));
		set.add(new Book("7",290.0,"Zikra",40));
		set.add(new Book("4",450.0,"Anita",20));
		set.add(new Book("6",980.0,"Naheen",60));
		set.add(new Book("9",2221.0,"Dinesh",70));
		set.add(new Book("1",330.0,"Akanksha",50));
		
		Iterator<Book> itr=set.iterator();
		while(itr.hasNext())
		{
			Book ele=itr.next();
			System.out.println(ele);
		}
		//If any book with duplicate isbn is added, what will happen?
		//No,There is no any duplicate values in output because in natural ordering there it will not takes any duplicate values
		
		//Books are stored in which order?
		//In this sorting based on natural ordering
		
		
	}

}
