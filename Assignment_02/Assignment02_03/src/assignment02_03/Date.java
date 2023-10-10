package assignment02_03;

import java.util.Scanner;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date()
	{
		this.month=0;
		this.day=0;
		this.year=0;
	}
	public Date(int month,int day,int year)
	{
		this.month=0;
		this.day=0;
		this.year=0;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		this.day=sc.nextInt();
		System.out.println("Enter the month:");
		this.month=sc.nextInt();
		System.out.println("Enter the year:");
		this.year=sc.nextInt();
	}
	public void display() {
        System.out.println("Date: " + month + "/" + day + "/" + year);
    }
	public static void main(String[] args)
	{
		Date myDate = new Date(10, 7, 2020);
		myDate.accept();
		myDate.display();
	}
}