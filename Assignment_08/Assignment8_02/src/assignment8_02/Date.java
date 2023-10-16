package assignment8_02;

import java.util.Scanner;

public class Date implements Displayable{
		int day;
		int month;
		int year;
		

		
		@Override
		public void acceptData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the day :");
			this.day=sc.nextInt();
			System.out.println("Enter the month :");
			this.month=sc.nextInt();
			System.out.println("Enter the year :");
			this.year=sc.nextInt();
		}
		
		@Override
		public void displayData() {
			System.out.println("Date" +this.day+ "/" +this.month+ "/" +this.year);
			
		}

		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + ", toString()=" + super.toString()
					+ "]";
		}
		
	}

