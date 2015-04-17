package lab3;

public class Apartment {
	
	private Building b;
	private double rentAmount;
	

	
	public Apartment(Building b, double rentAmount
			) {
		super();
		this.b = b;
		this.rentAmount = rentAmount;		
		
	}
	
	

	
	public double getRentAmount() {
		return rentAmount;
	}


	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	
	

}
