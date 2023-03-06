package constructor.injection.entiry2;

import constructor.injection.entity1.Subject;

public class Trainer 
{
	private Subject subject;
	
	public Trainer(Subject subject)
	{
		this.subject = subject;
	}
	
	//Printing The Constructor Injections
	public String teach()
	{
		return "<body bgcolor='pink' text='red'>"
					+ "<center><h1>Shiv is Training "+subject.getSub_Name()+" To Pratik</h1></center>"
			+ "</body>";
	}
}
