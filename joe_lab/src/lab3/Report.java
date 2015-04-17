package lab3;

import lab3.BuildingType.BuildingTypes;

public class Report {
	
	public static void main(String[] args) {
		
		Landloard landLord = new Landloard();
		double totalMonthlyProfit =0.0;
		
		Building[] buildings = {new BuildingType("a",10,BuildingTypes.CommercialBuildings),new BuildingType("b",10,BuildingTypes.FarmLand), 
				new BuildingType("c",10,BuildingTypes.SingleFamilyHomes),new BuildingType("d",10,BuildingTypes.Warehouses),
				new Building("f",10),new Building("g",30)} ;
		
		for(Building b:buildings)
		{
			landLord.addBuilding(b);
			totalMonthlyProfit+= b.getTotalMonthlyProfit();
		}
		
		
		
		
		
		
		System.out.println("Total profit of Landlord is:"+ totalMonthlyProfit);
		
	}

}
