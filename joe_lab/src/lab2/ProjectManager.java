package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectManager {
	
	private Feature feature1;
	private Feature feature2;
	private Feature feature3;
	
	private List<Project> projects = new ArrayList<Project>();
	private List<Release> release = new ArrayList<Release>();
	private List<Sprint> sprint   = new ArrayList<Sprint>();
	
	private Backlog backlog1 = new Backlog("Backlog1");	 
	private List<Developer> developer = new ArrayList<Developer>();
	
	private Date sprintStartDate = new Date(); 
	private Date sprintReleaseDate  = new Date();
	private Date dueDate = new Date();
	
	public ProjectManager()
	{
		
		addProject();
		
		 feature1 = new Feature("feature1","add login funciton");
		 feature2 = new Feature("feature2","add shoppingCart funciton");
		 feature3 = new Feature("feature3","add CheckOut funciton");
		 addFeaturesToBacklog();
		 createSprint();
		 assignFeatureToDeveloper();
		 createRelease();
		 
		
	}
	
	private void addProject()
	{
		projects.add(new Project("project1",backlog1));
	}
	
	private void assignFeatureToDeveloper()
	{
		developer.add(new Developer("Ajesh",feature1));
		developer.add(new Developer("Amrit",feature2));
		developer.add(new Developer("Binod",feature3));
	}

	
	private void createRelease()
	{
		release.add(new  Release("release1",sprintStartDate,sprintReleaseDate,sprint));
	}
	
	
	private void addFeaturesToBacklog()
	{
		backlog1.setFeatures(feature1);
		backlog1.setFeatures(feature2);
		backlog1.setFeatures(feature3);
	}




	private void createSprint()
	{
		sprint.add(new Sprint("sprint1",feature1,dueDate));
		sprint.add(new Sprint("sprint1",feature2,dueDate));
		sprint.add(new Sprint("sprint1",feature3,dueDate));
	}
	
	public List<Sprint> getSprint() {
		return sprint;
	}

	public List<Developer> getDeveloper() {
		return developer;
	}

}
