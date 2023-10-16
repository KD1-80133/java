package assignment8_02;

import java.util.Scanner;

public class Person implements Displayable {
	private String name;
	private int age;
	
	public Person() {
		this.name=name;
		this.age=age;
	}
	public Person(String string, int age) {
		this.name="";
		this.age=0;
}
	@Override
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of person : ");
		this.name=sc.next();
		System.out.println("Enter the age of person : ");
		this.age=sc.nextInt();

	}
	@Override
	public void displayData() {
		System.out.println("Name of the Person : "+this.name);
		System.out.println("Age of the Person : "+this.age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
