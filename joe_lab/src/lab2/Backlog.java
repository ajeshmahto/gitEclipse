package lab2;
import java.util.ArrayList;
import java.util.List;
public class Backlog {
	List<Feature> features = new ArrayList<Feature>();
	private String backlogName;
	
	public Backlog(String backlogName)
	{
		this.backlogName=backlogName;
		
	}
	
	
	

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(Feature feature) {
		if(!features.contains(feature))
		{
			features.add(feature);
		}
	}

	
	
}
