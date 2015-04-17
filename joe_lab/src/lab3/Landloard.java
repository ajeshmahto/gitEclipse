package lab3;

import java.util.ArrayList;
import java.util.List;

public class Landloard {
	
	
	private List<Building> building = new ArrayList<Building>();
	
	
	public void addBuilding(Building a )
	{
		if(!building.contains(a))
		{
			building.add(a);
			a.addApparment(new Apartment(a,300.00));
		}
	}
	

	
	
}
