package assignment_08;


import java.util.*;
public class Salaried_employee extends Employee {
	private double weeklySalary;

	public Salaried_employee(String first_name, String last_name, int SSN, int weelkysalary) {
		super(first_name, last_name, SSN);
		this.weeklySalary=weeklySalary;
	}
	
	
	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}


	@Override
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the weeklySalary = ");
		this.weeklySalary=sc.nextDouble();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Weekly_Salary = ");
	}

	@Override
	public String toString() {
		return "Salaried_employee [weeklySalary=" + weeklySalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double CalculateSalary() {
		System.out.println("WeeklySalary = "+this.weeklySalary);
		return this.weeklySalary;
	}

}