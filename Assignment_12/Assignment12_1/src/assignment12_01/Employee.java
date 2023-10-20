package assignment12_01;

interface Employee {
	double getSal();
	default double calcIncentives()
	{
		return 0.0;
	}
	static double calcTotalIncome(Employee arr[])
	{
		double totalIncome=0.0;
		for (Employee employee : arr) {
			totalIncome +=employee.getSal()+employee.calcIncentives();	
		}
	
	return totalIncome;
}
}
