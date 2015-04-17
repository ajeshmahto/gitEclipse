package lab3;

import java.util.ArrayList;
import java.util.List;



public class Building {
	
	private String BuildingName;	
	private List<Apartment> apartment = new ArrayList<Apartment>();
	
	
	
	
	private int noOfAparment;	
	private double totalBuildingRent;
	private double maintenanceCost;
	
	

	public Building(String buildingName, int noOfapartment) {
		super();
		BuildingName = buildingName;
		this.noOfAparment = noOfAparment;
	}
	
	
	public void addApparment(Apartment a)
	{
		if(!apartment.contains(a))
		{
			apartment.add(a);
		}
	}
	
	
	public double getTotalMonthlyProfit()
	{
		for(Apartment p :apartment)
		{
			totalBuildingRent+= p.getRentAmount();  
		}
		return totalBuildingRent-getMaintenanceCost();
	}
	
	public List<Apartment> getApartment() {
		return apartment;
	}


	public void setApartment(List<Apartment> apartment) {
		this.apartment = apartment;
	}
 
	public double getMaintenanceCost() {
		return maintenanceCost;
	}


	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	

	
}
