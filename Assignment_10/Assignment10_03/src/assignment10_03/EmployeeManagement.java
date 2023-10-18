package assignment10_03;
import java.util.*;

class Employee
{
	private int empid;
	private String name;
	private double salary;
	private double bonus;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary, double bonus) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the empid :");
		empid=scanner.nextInt();
		System.out.println("Enter the name :");
		name=scanner.next();
		System.out.println("Enter the salary:");
		salary=scanner.nextDouble();
		System.out.println("Enter the bonus :");
		bonus=scanner.nextDouble();		

	}
	public void displayData() {
		System.out.println("Employee Empid : "+this.empid);
		System.out.println("Employee Name :"+this.name);
		System.out.println("Employee Salary :"+this.salary);
		System.out.println("Employee Bonus :"+this.bonus);

	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
}

	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}
	

	
}
public class EmployeeManagement {

	public static void main(String[] args) {
		List<Employee> list=new LinkedList<>();
		//Scanner scanner =new Scanner(System.in);
		
		int choice;
		do 
		{
			System.out.println("----------Employee Management System--------");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Find Employee");
			System.out.println("4.Sort Employee");
			System.out.println("5.Edit Employee");
			System.out.println("Enter your choice");
			Scanner scanner =new Scanner(System.in);
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				Employee employee = new Employee();
                employee.acceptData();
                list.add(employee);
                System.out.println("Employee added.");
                System.out.println(employee);
                break;
			case 2:
				System.out.println("Enter the Empid to delete the Employee");
	        	int empidtodelete=scanner.nextInt();
	        	Employee key=new Employee();
	        	key.setEmpid(empidtodelete);
	        	if(list.remove(key))
	        		System.out.println("Employee is deleted");
	        	else
	        		System.out.println("Employee is not found in list");
	        	break;
			case 3:
				System.out.println("Enter the Empid :");
        	    int empid = scanner.nextInt();
        	    Employee key1 = new Employee();
        	    key1.setEmpid(empid);
        	    int index=list.indexOf(key1);
        	    if(index==-1)
        	    	System.out.println("Employee is not found.");
        	    else
        	    	System.out.println("Employee is  found"+index);
        	    key=list.get(index);
        	    System.out.println(key1);
        	    break;
			case 4:
				Employee employee1 = new Employee();
				class EmployeeComparator implements Comparator<Employee>
				{
					@Override
					public int compare(Employee e1, Employee e2) {
						int diff=e1.getEmpid()-e2.getEmpid();
						return diff;
					}
				}
				EmployeeComparator comparator = new EmployeeComparator();
			    list.sort(comparator);
			    System.out.println("Sorted List: ");
			    for (Employee employee2: list) {
			        employee2.displayData();
			    }
			    break;
			case 5:
				System.out.println("Enter empid to be modified: ");
				int Empid = scanner.nextInt();
				Employee key2 = new Employee();
				key2.setEmpid(Empid);
				int index1 = list.indexOf(key2);
				if(index1 == -1)
				{
				System.out.println("Employee not found.");
				}
				else 
				{
				Employee oldEmp = list.get(index1);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.acceptData();
				list.set(index1, newEmp);
				}
				break;
				
			default :
				System.out.println("Invalid choice please enter valid choice...");
			}
		}while(choice!=0);

	}

}
