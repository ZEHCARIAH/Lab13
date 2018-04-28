package edu.handong.csee.java.lab13.prob2;

public class Prob2 {	//declare public class prob2

	public static void main(String[] args) {	//declare public static void main method
		Book book = new Book("simple Book");	//Book has book member and declare Book("simple Book")
		History history = new History ("What is history?", "E.H.Carr");	//History has history member and declare History ("What is history?", "E.H.Carr")
		Science science = new Science ("Hello Physics!", "SciencWorld");	//Science has science member and declare Science ("Hello Physics!", "SciencWorld")
		book.show();	//book has show method
		history.show();	//history has show method
		science.show();	//science has show method

	}

}
