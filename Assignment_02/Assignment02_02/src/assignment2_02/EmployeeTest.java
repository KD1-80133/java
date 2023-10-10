package assignment2_02;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1=new Employee("Akanksha","Mule",1200);
		Employee employee2=new Employee("Zikra","Pirjade",13000);
		

		System.out.println("---------Employee Salary--------------");
		System.out.println("Yearly salary of Employee = "+employee1.calculateYearlySalary());
		System.out.println("Yearly salary of Employee = "+employee2.calculateYearlySalary());
		System.out.println("---------Salary After Raise--------");
		employee1.giveRaise();
		employee2.giveRaise();
		System.out.println("Yearly salary after raise = "+employee1.calculateYearlySalary());
		System.out.println("Yearly salary after raise = "+employee2.calculateYearlySalary());

	}

}