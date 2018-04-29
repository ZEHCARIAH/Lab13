package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{	//declare public class cat and inherit Animal class and realize pet interface class
	public String food()	//declare public String food
	{
		return "(Cat!)" + "Fish";	//return (Cat!) Fish
	}
}
