package edu.handong.csee.java.lab13.prob4;

public class Animal {	//declare public class Animal

	private String name;	//private String name method
	public void setName(String name)	//declare public void setName with String name
	{
		this.name=name;	//initialize name
	}
	public void getName()	//declare public void getName method
	{
		System.out.println("Name:"+name);	//printout Name: name
	}
}
