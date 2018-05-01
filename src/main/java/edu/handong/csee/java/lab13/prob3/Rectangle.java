package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shapes {	//declare public class Rectangle and extend Shapes class
	private double length;	//declare private double length
	private double width;	//declare private double width
	public Rectangle(double length, double width)	//declare public Rectangle method with double length, width
	{
		this.length = length;	//initialize length 
		this.width = width;	//initialize width
	}
	public double area()	//declare public double area method
	{
		return length*width;	//return length*width
	}
	public double parameter()	//declare public double parameter
	{
		return length+width;	//return length+width
	}
	public double getlength()	//declare public double getlength method
	{
		return length;	//return length
	}
	public double getwidth()	//declare public double getwidth
	{
		return width;	//return width

	}
}