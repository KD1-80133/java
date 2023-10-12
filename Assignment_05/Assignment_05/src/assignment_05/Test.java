package assignment_05;

public class Test {

	public static void main(String[] args) {
		Salaried_employee S=new Salaried_employee("", "", 0);
		S.acceptData();
		S.displayData();
		S.CalculateSalary();
		
		Hourly_employee H=new Hourly_employee("", "", 0);
		H.acceptData();
		H.displayData();
		H.CalculateSalary();
		
		Commission_employee C=new Commission_employee("", "", 0, 0, 0);
		C.acceptData();
		C.displayData();
		C.CalculateSalary();
		
		BasePlus_Commission_Employee B=new BasePlus_Commission_Employee("", "", 0, 0, 0);
		B.acceptData();
		B.displayData();
		B.CalculateSalary();

	}

}
