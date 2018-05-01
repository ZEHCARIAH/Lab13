package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;	//it can permit java util Scanner

public class Visualize {	//declare public class prob3

	public static void main(String[] args) {	//public static void main method
		double n1, n2;	//declare double n1 and n2
		Scanner keyboard = new Scanner(System.in);	//keyboard can typing in this system

		System.out.println("Enter radius: ");	//printout Enter radius:
		n1 = keyboard.nextDouble();	//n1 can typing
		Circle c1= new Circle(n1);	//Circle c1 member has n1 instead of radius

		System.out.println("Radius: "+ c1.getRadius());	//printout Radius + c1 method's getRadious method
		c1.display();	//Area: + area() + Parameter: +parameter()

		System.out.println("Enter length and width: ");	//printout Enter length and width
		n1=keyboard.nextDouble();	//n1 can typing
		n2=keyboard.nextDouble();	//n2 can typing
		Rectangle r1= new Rectangle(n1,n2);	//Rectangle r1 member has n1 and n2 instead of length and width

		System.out.println("Length: "+r1.getlength());	//printout Length + r1 method's getlegnth method
		System.out.println("Width: "+r1.getwidth());	//printout Width + r1 method's getwidth method
		r1.display();	//Area: + area() + Parameter: +parameter()
	} 

}
