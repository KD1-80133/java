package assignment12_02;

import java.util.*;
import java.util.function.Predicate;

public class Length {
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
		// call countIf() to count number of strings have length more than 6 -- using
		// anonymous inner class
		int cnt = countIf(arr, new Predicate<String>() {
			public boolean test(String s) {
				return s.length() > 6;
			}
		});
		System.out.println("Result: " + cnt); // 2
		
		System.out.println("------count by Lambda expression-------");
		// call countIf() to count number of strings have length more than 6 -- using
		// lambda expressions
		int count=countIf(arr,s->s.length()>6);
		System.out.println("count:"+count);
		}

	}


