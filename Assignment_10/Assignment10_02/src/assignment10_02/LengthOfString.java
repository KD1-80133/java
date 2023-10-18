package assignment10_02;

import java.util.*;
public class LengthOfString {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Akanksha mule");
		list.add("Manav");
		list.add("Naheen");
		list.add("Nidhi");
		list.add("Dinesh");
		list.add("Nytra");
		
		class LengthComparator implements Comparator<String>
		{
			@Override
			public int compare(String s1, String s2)
			{
				int diff=s1.length()-s2.length();
				return diff;
			}
		}
		
		LengthComparator comparator =new LengthComparator();
		System.out.println("Highest length:"+Collections.max(list,comparator));
		

	}

}
