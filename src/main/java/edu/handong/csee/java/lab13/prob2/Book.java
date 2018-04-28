package edu.handong.csee.java.lab13.prob2;

public class Book {	//declare class Book
	private static int idcount=0;	//declare private static integer idcount equal 0
	private String Name;	//declare private String Name
	private int id;	//declare private integer id

	public Book(String name)	//declare public Book method with String name
	{
		this.Name = name;	//Name initialize and equal name by using this
		idcount++;	//idcount increase 1 each process 
		id=idcount;	//id equal idcount
	}

	public String string()	//declare public String string method
	{
		return "\nId: " + id + "\nBook Name:" + Name;	//return Id: id, Book Name: Name
	}
	public void show()	//declare public void show method
	{
		System.out.println("<<<Book>>>"+this.string());	//printout <<<Book>>> and initialize String method
	}
}