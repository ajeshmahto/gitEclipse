package lab3;

public class BuildingType extends Building{
	
	String buildingType;
	
	public enum BuildingTypes {
		
	SingleFamilyHomes,
	CommercialBuildings,
	Warehouses,
	FarmLand
	
	}

	public BuildingType(String buildingName, int noOfapartment,BuildingTypes buildingType) {
		super(buildingName, noOfapartment);
		this.buildingType=buildingType.toString();
		
	}
	
	@Override	
	public double getTotalMonthlyProfit()
	{
		if(buildingType.equals("SingleFamilyHomes"))
		{
			return 5000;
		}
		
		else if(buildingType.equals("CommercialBuildings"))
		{
			return 6000;
		}
		
		else if(buildingType.equals("Warehouses"))
		{
			return 6500;
		}
		else if(buildingType.equals("FarmLand"))
		{
			return 3000;
		}
	
		return 0;
	}

}
