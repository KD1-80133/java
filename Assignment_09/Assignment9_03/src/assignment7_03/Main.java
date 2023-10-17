package assignment7_03;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Student[] arr=new Student[5];
		arr[0] = new Student(1,"Akanksha" ,"Solapur" ,23);
		arr[1] = new Student(2,"Akanksha" ,"Pune"    ,22);
		arr[2] = new Student(3,"Ram"      ,"Mumbai"  ,22);
		arr[3] = new Student(5,"Manav"    ,"Pune"    ,33);
		arr[4] = new Student(4,"Naheen"   ,"Sangli"  ,13);
		
		System.out.println("Before Sort: ");
		for (Student s: arr)
			System.out.println(s);
		
		class  StudDescComparator implements Comparator<Student> {
			public int compare(Student s1, Student s2) {
			int diff = -s1.getCity().compareTo(s2.getCity());
			if(diff == 0)
			diff = - Double.compare(s1.getMarks(),s2.getMarks());
			if(diff == 0)
			diff = - s1.getName().compareTo(s2.getName());
			return diff;
			}
		}
		StudDescComparator comparator=new StudDescComparator();
		Arrays.sort(arr,comparator);
		System.out.println("After Sort :");
		for (Student s : arr) {
			System.out.println(s);
		}
		
  }
}