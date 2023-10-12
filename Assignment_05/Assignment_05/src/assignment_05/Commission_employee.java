package assignment_05;

import java.util.*;
public class Commission_employee extends Employee{
	
	private int grossSales;
	private int commissionRate;
	
	public Commission_employee(String first_name, String last_name, int SSN,int grossSales,int commissionRate) {
		super(first_name, last_name, SSN);
		this.grossSales=grossSales;
		this.commissionRate=commissionRate;
	}
	
	
	public int getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}


	public int getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(int commissionRate) {
		this.commissionRate = commissionRate;
	}


	@Override
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the Gross Sales = ");
		this.grossSales=sc.nextInt();
		System.out.println("Enter the Commission Rate = ");
		this.commissionRate=sc.nextInt();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Gross_Sales = "+this.grossSales);
		System.out.println("Commission_Rate = "+this.commissionRate);
	}

	@Override
	public String toString() {
		return "Commission_employee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void CalculateSalary() {
		System.out.println("commission = "+(this.commissionRate*this.grossSales));
		
	}
	
}
