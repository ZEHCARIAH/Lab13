package edu.handong.csee.java.lab13.prob2;

public class History extends Book {	//declare public class History and extend Book class functions
	private String Author;	//declare private String Author
	public History(String Name, String Author)	//declare public History method with String Name , String Author members
	{
		super(Name);	//call high concept Name by using super
		this.Author = Author;	//Author initialize by using this
	}

	public String string()	//declare public String string
	{
		return super.string() + "\nAuthor: "+ Author;	//return Name.string + Author: + Author
	}

	public void show()	//declare public void show
	{
		System.out.println("<<<History>>>" +	
				this.string());	//printout <<<History>>> + initialize String method
	}
}