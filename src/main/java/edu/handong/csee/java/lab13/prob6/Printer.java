package edu.handong.csee.java.lab13.prob6;

public class Printer {	//declare public class Printer
	public static void print(Object object)	//declare public static void Print class and indicate parameter Object
	{
		String str = object.toString();	//String str equal that object call toString method
		if(object instanceof CapitalPrint)	//if object member call CapitalPrint class 
			str= str.toUpperCase();	//str can call toUpperCase method
		System.out.println(str);	//printout toUpperCase

	}

}
