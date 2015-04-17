package lab2;

import java.util.Date;
import java.util.List;

public class Sprint implements CalculateWork {

	private Date dueDate;
	private String sprintName;
	
	private Feature feature;
	private String status;
	
	enum Status
	{
		completed,remaining,pending
	}
	
	//List<Feature> listOfFeature;
	
	public Sprint(String sprintName, Feature feature, Date dueDate )
	{
		this.sprintName=sprintName;
		this.feature=feature;
		this.dueDate=dueDate;
	}
	
	public void setStatus(Status s)
	{
		status=s.toString();
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getSprintName() {
		return sprintName;
	}

	@Override
	public String amountOfWorkRemaining() {
		// TODO Auto-generated method stub
		return "80% work completed";
	}

}
