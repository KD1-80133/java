package assignment_08;

class Emp<T extends Employee>
{
	private T data;
	public void set(T obj)
	{
		this.data=data;
	}
	public T get()
	{
		return this.data;
	}
	public double CalculateSalary()
	{
		return data.CalculateSalary();
	}
	
}
public class Test {

	public static void main(String[] args) {
		Commission_employee C=new Commission_employee("Akanskha", "Mule", 12, 23, 34);
		C.acceptData();
		C.displayData();
		Emp<Commission_employee> C1= new Emp<>();
		C1.set(C);
		System.out.println("Commission of Employee:"+C.CalculateSalary());
		
		Hourly_employee H=new Hourly_employee("Akanksha", "mule", 23,23,23);
		H.acceptData();
		H.displayData();
		Emp<Hourly_employee> H1= new Emp<>();
		H1.set(H);
		System.out.println("hourly salary of Employee:"+H.CalculateSalary());

		Salaried_employee S=new Salaried_employee("Akanksha", "mule", 23,23);
		S.acceptData();
		S.displayData();
		Emp<Salaried_employee> S1= new Emp<>();
		S1.set(S);
		System.out.println("weekly employee of Employee:"+S.CalculateSalary());

	}

}



