package assignment12_05;

import java.util.Scanner;

public class CheckMain {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for(T ele: arr) {
			if(c.compare(ele, key))
		count++;
	}
		return count;
	}
	public static void main(String[] args) {
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;	
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt);
		
		Double [] arr1= {34.0,23.0,44.0,34.0,44.0,66.0,25.0};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the key to check duplicate");
		Double key1=scanner.nextDouble();
		int cnt1=countIf(arr1,key1,(b1,b2)->b1.equals(b2));
		System.out.println(cnt1);
			
		}
		

	}


