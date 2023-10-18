package assignment10_04;

import java.util.*;
public class ListCheck {

	public static void main(String[] args) {
		
		Collection<String> c1= new ArrayList<>();
		c1.add("B");
		c1.add("D");
		c1.add("A");
		c1.add("C");
		c1.add(null);
		c1.add(null);
		c1.add(null);
		System.out.println("Using ArrayList....");
		System.out.println(c1.toString());
		System.out.println("In ArrayList Null,Multiple Null and Duplicates are allowed..");
		System.out.println();
		
		Collection<String> c2=new LinkedHashSet<>();
		c1.add("B");
		c1.add("D");
		c1.add("A");
		c1.add("C");
		c1.add(null);
		c1.add(null);
		c1.add(null);
		System.out.println("Using LinkedHashSet....");
		System.out.println(c2.toString());
		System.out.println("In LinkedHashSet Null is allowed but Multiple Null and Duplicates are not allowed..");
		System.out.println();
		
		Collection<String> c3=new TreeSet<>();
		c1.add("B");
		c1.add("D");
		c1.add("A");
		c1.add("C");
		c1.add(null);
		c1.add(null);
		c1.add(null);
		System.out.println("Using TreeSet....");
		System.out.println(c3.toString());
		System.out.println("In TreeSet we can't add Null beacuse it gives nullpointerException..");
		System.out.println();
		
	}

}
