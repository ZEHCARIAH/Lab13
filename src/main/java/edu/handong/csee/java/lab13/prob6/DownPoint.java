package edu.handong.csee.java.lab13.prob6;

public class DownPoint {	//declare public class Downpoint 
	private int x,y;	//declare private integer x and y
	DownPoint(int x, int y)	// declare DonwPoint method with integer x and y
	{
		this.x=x;	//initialize x
		this.y=y;	//initialize y
	}
	public String toString() {	//declare public String toString method
		return "x : " + x + " y : " +y;	//return x: x y: y
	}
}
