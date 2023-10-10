package assignment2_02;

public class Employee {
	private String first_name;
	private String second_name;
	private double monthly_salary;
	
	public Employee()
	{
		this.first_name="";
		this.second_name="";
		this.monthly_salary=0.0;
	}
	
	public Employee(String first_name,String second_name,double monthly_salary)
	{
		this.first_name=first_name;
		this.second_name=second_name;
		this.monthly_salary=monthly_salary;
	}
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public double getMonthly_salary() {
		return monthly_salary;
	}

	public void setMonthly_salary(double monthly_salary) {
		if(monthly_salary<0){
		this.monthly_salary =0.0;
		}
		else
		{
			this.monthly_salary=monthly_salary;
		}
	}
	   public double calculateYearlySalary() {
	        return monthly_salary * 12;
	    }

	    // Method to give a 10% raise
	    public void giveRaise() {
	        monthly_salary *= 1.10;
	    }
}