package eud.handong.csee.java.lab13.prob1;

public class InstanceOf {	//declare class InstanceOf

	public static void WhatFriend(Friend friend)	//declare public static void WhatFriend with Friend class and has friend member
	{
		if	
			(friend instanceof ClassFriend) //if friend check and change ClassFriend type
			((ClassFriend)friend).ClassFriend();	// ClassFriend's friend call ClassFriend function
		else if
			(friend instanceof SchoolFriend)	//else if  check and change SchoolFriend type
			((SchoolFriend)friend).SchoolFriend();	// School Friend's friend call SchoolFriend function
		else 
			friend.JustFriend();	//else friend call JustFriend
	}
}