/*In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen? Books are stored in which order?*/
package assignment11_02;
import java.util.*;
public class Library {

	public static void main(String[] args) {
		Set<Book> set =new LinkedHashSet<>();
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
		//Yes,HashSet will take duplicate value because there is no any hashcode() and equals() methods in class book
		
		//Books are stored in which order?
		//Output is in order of insertion
		
		
	}

}
