package edu.handong.csee.java.lab13.prob3;

public abstract class Shapes {	//declare public abstract class Shapes, abstract can add method without implementation of body
	public abstract double area();	//declare public abstract double area (call area method)
	public abstract double parameter();	//declare public abstract double parameter method (call parameter method)
	public void display()	//declare public void display
	{
		System.out.println("Area: "+area() +"\nPerimeter: "+parameter()+"\n");	//printout Area : area(), Parameter: parameter()

	}
}
