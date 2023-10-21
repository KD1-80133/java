package assignment13_01;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class Library {

	public static void main(String[] args) {
		List<Book> list=new ArrayList<>();

		
		int choice;
		
		do {
			System.out.println("--------Library System----------");
			System.out.println("1.Add new book in list.");
			System.out.println("2. Display all books in forward order using random access.");
			System.out.println("3. Search a book with given isbn.");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.println("7.Save books in ﬁle");
			System.out.println("8.load books from ﬁle");
			System.out.println("9.Exit");
			System.out.println("Enter your choice");
	        Scanner scanner = new Scanner(System.in);
	        choice=scanner.nextInt();
	        
	        
			switch(choice)
	        {
	        case 1:
	        	Book book=new Book();
	        	book.acceptData();
	        	if(list.contains(book))
	        	{
	        		System.out.println("Book is already present");
	        		int index = list.indexOf(book);
	        		book=list.get(index);
	        		book.setQuantity(book.getQuantity()+1);
	        	}
	        	else 
	        	{
	        	
	        	list.add(book);
	        	System.out.println(" book id not present,Book added to list.");
	        	}
	        	break;
	        case 2:
	        	Iterator<Book> itr=list.iterator(); 
	        	while(itr.hasNext())
	        	{
	        		Book b1=itr.next();
	        		System.out.println(b1);
	        	}
	        	break;
	        case 3:
	        	 System.out.println("Enter the isbn :");
	        	    String isbn = scanner.next();
	        	    Book key = new Book();
	        	    key.setIsbn(isbn);
	        	    int index=list.indexOf(key);
	        	    if(index==-1)
	        	    	System.out.println("Book is not found.");
	        	    else
	        	    	System.out.println("Book is  found"+index);
	        	    key=list.get(index);
	        	    System.out.println(key);
	        	    break;
	        case 4:
	        	System.out.println("Enter the index to delete:");
	    	    int index1 = scanner.nextInt();
	    	    if (index1 >= 0 && index1 < list.size()) {
	    	        list.remove(index1);
	    	        System.out.println("Book removed successfully.");
	    	    } else {
	    	        System.out.println("Invalid index. The list size is " + list.size() + ".");
	    	    }
	    	    break;
	    	case 5:
	    		System.out.println("Enter the ISBN to delete the book");
	        	String isbntodelete=scanner.next();
	        	Book key1=new Book();
	        	key1.setIsbn(isbntodelete);
	        	if(list.remove(key1))
	        		System.out.println("Book is deleted");
	        	else
	        		System.out.println("Book is not found in list");
	        	break;
	        case 6:
	        	Collections.reverse(list);
	    		System.out.println("Reveresed List: ");
	            break;
	           
	        case 7:
	        	try(FileOutputStream fout = new FileOutputStream("Books.txt")) {
	    			try(DataOutputStream dout = new DataOutputStream(fout)) {
	    				for(Book b : list) {
	    					dout.writeUTF(b.getIsbn());
	    					dout.writeDouble(b.getPrice());
	    					dout.writeUTF(b.getAuthorName());
	    					dout.writeInt(b.getQuantity());
	    				}
	    			} // dout.close();
	    		} // fout.close();
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	    		
	    		System.out.println("Books are saved.");
	    		break;
	        case 8:
	        	try(FileInputStream fin = new FileInputStream("Books.txt")) {
	    			try(DataInputStream din = new DataInputStream(fin)) {
	    				while(true) {
	    					Book b = new Book();
	    					b.setIsbn(din.readUTF());
	    					b.setPrice(din.readDouble());
	    					b.setAuthorName(din.readUTF());
	    					b.setQuantity(din.readInt());
	    					System.out.println(b);
	    				}
	    			} // din.close();
	    		} // fin.close();
	    		catch (EOFException e) {
	    			
	    		}
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	        	break;
	    	
	        case 9:
	        	System.out.println("Exiting the library system.");
	            break;
	        	
	        default:
	            System.out.println("Invalid choice. Please enter a valid option.");
	        }
			
	        } while (choice != 0);
	       
		}
}


