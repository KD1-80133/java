/*Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. Do we need to write equals() and hashCode() in Book
class?*/
package assignment11_05;
import java.util.*;
public class Library {

	public static void main(String[] args) {
		
		Map<String,Book> map =new HashMap<>();
		
		int choice;
		do
		{
			System.out.println("1.Add Book");
			System.out.println("2.Find Book");
			System.out.println("Enter your choice");
			Scanner scanner = new Scanner(System.in);
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				Book book = new Book();
				book.acceptData();
				map.put(book.getIsbn(), book);
				break;
			case 2:
				System.out.println("Enter the ISBN To find a Book :");
				String isbn=scanner.next();
				Book book1=map.get(isbn);
				if(book1!=null)
				{
					System.out.println("Book Found...\n"+book1.toString());
				}
				else
				{
					System.out.println("Book not found..Please enter the valid ISBN:");
				}
				break;
			}
		}while(choice!=0);
	}
		
		
}
//Do we need to write equals() and hashCode() in Book class?
//No,we don't need to write hashCode() and equals() methods in class as our key is String and String class has it's own hasCode() and equals() methods.
