package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{	//declare public class dog and inherit Animal class and realize interface Pet class
	public String food()	//declare public String food
	{
		return "(Dog!)" + "Sausage";	//return Dog! Sausage
	}
}