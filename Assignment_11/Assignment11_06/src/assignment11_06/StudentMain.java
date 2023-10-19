/*Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time. Do we need to write equals() and
hashCode() in Student class? Follow menu-driven approach.*/

package assignment11_06;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Map<Integer,Student> map =new LinkedHashMap<>();
		
		int choice;
		do
		{
			System.out.println("1.Add Student ");
			System.out.println("2.Find Student");
			System.out.println("Enter your choice");
			Scanner scanner=new Scanner(System.in);
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				Student student = new Student();
				student.acceptStudent();
				map.put(student.getRoll(), student);
				break;
			case 2:
				System.out.println("Enter the Roll no To find a student :");
				int roll=scanner.nextInt();
				Student student1=map.get(roll);
				if(student1!=null)
				{
					System.out.println("Student Found...");
					student1.toString();
				}
				else
				{
					System.out.println("Student not found..Please enter the valid Roll No:"+roll);
				}
				break;
		}

		}while(choice!=0);
	}
}

//Do we need to write equals() and hashCode() in Student class?
//No,we don't need to write hashCode() and equals() methods in class as our key is Integer and Integer class has it's own hasCode() and equals() methods.

