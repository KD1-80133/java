package assignment11_07;

public class EmployeeSalary {

	public static void main(String[] args) {
		Manager manager=new Manager(500,300);
		Labor labor=new Labor(1200,10);
		Clerk clerk=new Clerk(10);
		
		Employee[] employee= {manager,labor,clerk};
		double totalIncome = Employee.calcTotalIncome(employee);
	    System.out.println("Total income of all employees: " + totalIncome);
		
		

	}

}
