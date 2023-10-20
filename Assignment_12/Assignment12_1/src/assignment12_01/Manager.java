package assignment12_01;

public class Manager implements Employee {
	private double basicSalary;
	private double dearanceAllowance;
	
	public Manager(double basicSalary, double dearanceAllowance) {
		
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	@Override
	public double getSal() {
		return basicSalary + dearanceAllowance;
	}
	@Override
	public double calcIncentives() {
		return basicSalary*0.2;
	}
	

}
