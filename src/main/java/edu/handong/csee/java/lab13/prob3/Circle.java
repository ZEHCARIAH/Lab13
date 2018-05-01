package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shapes {	//declare public class Circle and extend Shapes class
	private double radius;	//declare private double radius
	public Circle (double r)	//declare public Circle method witdh double r
	{
		radius =r;	//radius equal r
	}
	public double area()	//declare public double area method
	{
		return Math.PI+Math.pow(radius, 2);	//return pi * r* r
	}
	public double parameter()	//declare public double parameter method
	{
		return 2.0*Math.PI*radius;	//return 2*pi*r
	}
	public double getRadius()	//declare public double getRadius method
	{
		return radius;	//return radius
	}
}
