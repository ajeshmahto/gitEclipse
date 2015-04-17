package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
	
	
	private String projectName;
	private Backlog backlog;
	
	public Project(Backlog backlog) {
		super();
		this.backlog = backlog;
	}

	public Project(String projectName,Backlog backlog )
	{
		this.projectName=projectName;
		this.backlog=backlog;
	}
	
	
	
}
