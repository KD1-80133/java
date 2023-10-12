package assignment_05;

import java.util.*;
abstract public class Employee {
	private String first_name;
	private String last_name;
	private int SSN;
	
	abstract public void CalculateSalary();
	
	public Employee(String first_name, String last_name, int SSN) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		SSN = SSN;
	}
	
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name = ");
		this.first_name=sc.next();
		System.out.println("Enter Last name = ");
		this.last_name=sc.next();
		System.out.println("Enter the Social Security number = ");
		this.SSN=sc.nextInt();
	}
	public void displayData() {
		System.out.println("Frist_name = "+this.first_name);
		System.out.println("Last_name = "+this.last_name);
		System.out.println("SSN = "+this.SSN);

	}

	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", last_name=" + last_name + ", SSN=" + SSN + "]";
	}
	
	
	
	
}
