package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Release {
	
  private	List<Feature> feature = new ArrayList<Feature>();
  private   List<Sprint> sprint   = new ArrayList<Sprint>();
  private   Date sprintStartDate;
  private   Date sprintReleaseDate;
  private   String releaseName;
  
	
	Release(String releaseName, Date sprintStartDate, Date sprintReleaseDate, List<Sprint> sprint )
	{
		this.releaseName=releaseName;
		this.sprintStartDate=sprintStartDate;
		this.sprintReleaseDate =sprintReleaseDate;
		this.sprint=sprint;
	}

	
	
}
