package lab4;

public class Hourly extends Employee {

	private double hourlyWage;
	private int hoursPerWeek;
	private int employeeId;
	
	
	public Hourly(int employeeId, double hourlyWage, int hoursPerWeek) {
		super(employeeId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}


	
	
	
	@Override
	public double calcGrossPay() {
		
		return hourlyWage*hoursPerWeek*4;
		
	}
	

}
