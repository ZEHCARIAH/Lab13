package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {	//declare public class Science and extend Book class functions
	private String publisher;	//declare private String publisher
	public Science (String Name, String Publisher)	//declare public Science method with String Name , String publisher members
	{
		super(Name);	//call high concept Name by using super
		this.publisher = publisher;	//publisher initialize by using this
	}
	public String string()	//declare public String string
	{
		return super.string() + "\nPublisher" + publisher;	//return Name.string + Publishers: + publisher
	}

	public void show()	//declare public void show
	{
		System.out.println("<<<Science>>>" + this.string());	//printout <<<Science>>> + initialize String method
	}
}
