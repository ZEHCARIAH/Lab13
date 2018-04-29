package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;	//can use Scanner function

public class ShowEqual {	//declare public class ShowEqual
	public static boolean equals(int[][]n1, int [][]n2)	//declare public static boolean equals with int [][]n1, int [][]n2 method
	{
		int count=0;	//int count equal 0
		if(n1.length!=n2.length)	//if n1's length does not same n2's length
			return false;	//return false
		for(int i=0;i<n1.length;i++)	//if int i=0 and i increase until n1's length, i increase each 1
		{
			for(int j=0;j<n1.length;j++)	//if int j=0 and j increase until n1's length, j increase each 1
			{
				if(n1[i][j]!=n2[i][j])	//if n1's array does not same n2 array
					count++;	//count increase each 1
			}
		}


		if(count<=3)	//if count lower and same 3
			return true;	//return true
		else
			return false;	//return false
	}

	public static void main(String[] args) {	//declare public static void main class
		int a1,a2=0;	//declare int a1 and a2

		Scanner keyboard= new Scanner(System.in);	//can use typing function

		System.out.print("Enter row size(maximum 5):");	//printout Enter row size(maximum 5):
		a1=keyboard.nextInt();	//a1 can typing 
		System.out.print("Enter column size(maximum 5):");	//Enter column size(maximum 5):
		a2=keyboard.nextInt();	//a2 can typing

		int [][]n1= new int[a1][a2];	//int n1's array has int a1 and a2 in array form

		System.out.print("Enter row size(maximum 5):");	//printout Enter row size(maximum 5):
		a1=keyboard.nextInt();	//a1 can typing 
		System.out.print("Enter column size(maximum 5):");	//Enter column size(maximum 5):
		a2=keyboard.nextInt();	//a2 can typing

		int [][]n2=new int[a1][a2];	//int n2's array has int a1 and a2 in array form

		System.out.print("Enter List1: ");	//printout Enter List1:
		for(int i=0;i<n1.length;i++) 	//if int i=0 and i lower than n1's length, i increase each 1
			for(int j=0;j<n1[i].length;j++)	//if int j=0 and j lower than n1 array with [i]value's length, j increase each 1
				n1[i][j] = keyboard.nextInt();	//array n1[i][j] can typing

		System.out.print("Enter List2: ");	//printout Enter List2
		for(int i=0;i<n2.length;i++) {	//if int i=0 and i lower than n2's length, i increase each 1
			for(int j=0;j<n2[i].length;j++)	//if int j=0 and j lower than n2 array with [i]value's length, j increase each 1
				n2[i][j] = keyboard.nextInt();	//array n1[i][j] can typing
		}
		for(int i=0;i<n1.length;i++) {	//if int i=0 and i lower than n1's length, i increase each 1
			for(int j=0;j<n1[i].length;j++)	//if int j=0 and j lower than n1 array with [i]value's length, j increase each 1
				System.out.print(n1[i][j] + " ");	//printout n1[i][j]
			System.out.println();	//printout blank
		}
		System.out.println();	//printout blank
		for(int i=0;i<n2.length;i++) {	//if int i=0 and i lower than n2's length, i increase each 1
			for(int j=0;j<n2[i].length;j++)	//if int j=0 and j lower than n2 array with [i]value's length, j increase each 1
				System.out.print(n2[i][j] + " ");	//printout n1[i][j]
			System.out.println();	//printout blank
		}
		System.out.println();	//printout blank

		if(equals(n1,n2))	//if n1 object and n2 same
			System.out.println("The two arrays are approximately identical.");	//printout The two arrays are approximately identical.
		else
			System.out.println("The two arrays are not identical");	//printout The two arrays are not identical
	}
}
