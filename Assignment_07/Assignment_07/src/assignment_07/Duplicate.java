package assignment_07;
import java.util.*;

public class Duplicate {

	public static void main(String[] args) {

		String arr1[] = { "saha", "fgh", "man", "baba", "ajji", "mum", "baba" };
		String arr2 = new String();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					arr2 += arr1[i];
				}
			}
		}
		System.out.println("Duplicate values are" + arr2);
	}
}
