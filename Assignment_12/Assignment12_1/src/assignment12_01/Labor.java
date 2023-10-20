package assignment12_01;

public class Labor implements Employee{
	private double hours;
	private double rate;
	
	
	public Labor(double hours, double rate) {
		
		this.hours = hours;
		this.rate = rate;
	}
	@Override
	public double getSal() {
		return hours*rate;
	}
	@Override
	public double calcIncentives() {
		if(hours>300)
		{
		return getSal()*0.5;
		}
		else
		{
			return 0.0;
		}
			
	}
	

}
