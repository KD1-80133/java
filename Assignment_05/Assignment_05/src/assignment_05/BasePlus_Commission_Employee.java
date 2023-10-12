package assignment_05;

import java.util.*;
public class BasePlus_Commission_Employee extends Commission_employee {
	private double baseSalary;
	
	public BasePlus_Commission_Employee(String first_name, String last_name, int SSN, int grossSales,
			int commissionRate) {
		super(first_name, last_name, SSN, grossSales, commissionRate);
		this.baseSalary=baseSalary;
	}
	
	
	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	@Override
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the Base Salary");
		this.baseSalary=sc.nextDouble();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Base_Salary = "+this.baseSalary);
	}

	@Override
	public String toString() {
		return "BasePlus_Commission_Employee [baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void CalculateSalary() {
		super.CalculateSalary();
		System.out.println("New Base Salary ="+((this.getCommissionRate()*this.getGrossSales())+this.baseSalary*1.10));
		
	}
	

	



}
