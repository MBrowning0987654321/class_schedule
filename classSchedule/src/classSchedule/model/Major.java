package classSchedule.model;

import java.util.List;


public class Major {
	
	private String name;
	private int id;
	//private List<Course> requirements;
	
	public Major ()
	{
		
	}
	
	//Return the name of the string
	public String getName()
	{
		return name;
	}
	
	//Set the name of the major
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

}
