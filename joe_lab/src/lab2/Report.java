package lab2;

import java.util.List;

public class Report {
	
	private static ProjectManager pm = new ProjectManager();
	private static List<Developer> developer = pm.getDeveloper();
	private static List<Sprint> sprint = pm.getSprint();
	public static void main(String[] args) {
		

		developerReport();
		managerReport();
		
		
		
		
		
	}
	
	
	public static void developerReport()
	{
		for(Developer dev:developer)
		{
			System.out.println("Name->"+dev.getDeveloperName()+" has been assigned "+dev.getAssignFeature()+" and his work status "+dev.amountOfWorkRemaining());
		}
		
	}
	
	public static void managerReport()
	{
		
		for(Sprint s:sprint)
		{
			System.out.println("Sprint Name-> "+s.getSprintName()+" status is "+s.amountOfWorkRemaining() );
			
		}
		
	}
	
	

}
