package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint{	//declare public class UpPoint and realize interface CapitalPrint class
	private int x, y;	//declare private integer x and y
	UpPoint(int x, int y)	//declare UpPoint method with integer x and y
	{
		this.x=x;	//initialize x
		this.y=y;	//initialize y
	}
	public String toString()	//declare public String toString method
	{
		return "x : " + x + " y : " +y;	//return x: x y: y
	}
}
