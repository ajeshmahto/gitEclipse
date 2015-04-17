package lab4;

public abstract class Employee {
	
	private int employeeId;
	
	
	public Employee(int employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public void print()
	{
		
	}

	public Paycheck calcCompensation(int month)
	{
		return null;
	}
	
	public abstract double calcGrossPay();
}
