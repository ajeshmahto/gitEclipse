package lab4;

public class Salaried extends Employee {
	
	private double salary;
	private int employeeId;

	public Salaried( int employeeId,double salary) {
		super(employeeId);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay() {
		
		return salary;
	}

}
