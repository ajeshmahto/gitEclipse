package lab2;


import java.util.Date;

public class Developer implements CalculateWork {
	
	private String developerName;
	private Feature assignFeature;
	private Date committedDate;
	
	
	public Developer(String developerName, Feature assignFeature)  {
		super();
		this.developerName = developerName;
		this.assignFeature = assignFeature;
		
	}


	public Date getCommittedDate() {
		return committedDate;
	}


	public String getDeveloperName() {
		return developerName;
	}


	public Feature getAssignFeature() {
		return assignFeature;
	}


	public void setCommittedDate(Date committedDate) {
		this.committedDate = committedDate;
	}


	@Override
	public String amountOfWorkRemaining() {
		
		return "50% completed";
		
	}
	
	

}
