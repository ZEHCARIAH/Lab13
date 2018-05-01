package edu.handong.csee.java.lab13.prob6;

public class Visualize {	// declare public class Visualize

	public static void main(String[] args) {	//declare public static void main method
		UpPoint p1= new UpPoint(3,3);	//UpPoint p1 call 3,3
		DownPoint p2= new DownPoint(2,5);	//DownPoint p2 call 2,5
		DownPoint p3 = new DownPoint(4,7);	//DownPoint p2 call 2,5
		UpPoint p4 = new UpPoint(9,12);	//UpPoint p1 call 3,3
		Printer.print(p1);	//print string p1
		Printer.print(p2);	//print string p2
		Printer.print(p3);	//print string p3
		Printer.print(p4);	//print string p4

	}

}
