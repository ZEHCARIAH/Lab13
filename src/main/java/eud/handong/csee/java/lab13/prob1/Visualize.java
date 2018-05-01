package eud.handong.csee.java.lab13.prob1;

public class Visualize {	//declare public class prob1

	public static void main(String[] args) {	//declare public static void main method
	Friend friend1 = new Friend();	//Friend declare friend1 and call by using new 
	SchoolFriend friend2 = new SchoolFriend();	//SchoolFriend declare friend2 and call by using new
	ClassFriend friend3 = new ClassFriend();	//ClassFriend declare friend3 and call using by new

	InstanceOf.Friend(friend1);	//InstanceOf call Friend change friend as friend1
	InstanceOf.Friend(friend2);	//InstanceOf call Friend change friend as friend2
	InstanceOf.Friend(friend3);	//InstanceOf call Friend change friend as friend3
	}

}
