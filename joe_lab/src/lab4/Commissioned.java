package lab4;

import java.util.List;

public class Commissioned extends Employee {
	
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	private int employeeId;
	
	
	
	public Commissioned(int employeeId,double commission, double baseSalary, List<Order> orders) {
		super(employeeId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}



	@Override
	public double calcGrossPay() {
		
		return 0;
	}

}
