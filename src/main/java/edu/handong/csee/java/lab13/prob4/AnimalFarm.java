package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;	//can use Scanner function

public class AnimalFarm {	//declare public class AnimalFarm
	public void feed(Pet pet)	//declare public void feed class and declare pet member in Pet class
	{
		System.out.println("feed: "+ pet.food());	//printout feed: Fish and Sausage
	}

	public static void main(String[] args) {	//declare public static void main method

		String catname, dogname;	//declare String catname and dogname

		AnimalFarm animalfarm = new AnimalFarm();	//declare animalfarm and give AnimalFarm function
		Cat cat = new Cat();	//cat has Cat class function
		Dog dog = new Dog();	//dog has Dog class function

		Scanner keyboard = new Scanner(System.in);	//can use typing
		System.out.println("Enter the cat name and dog name: ");	//printout Enter the cat name and dog name
		catname=keyboard.next();	//catname can typing
		dogname=keyboard.next();	//dogname can typing

		cat.setName(catname);	//call setName method and call catname
		cat.getName();	//call Name: name
		animalfarm.feed(cat);	//call feed method and replace pet as cat

		dog.setName(dogname);	//call setName method and call dogname
		dog.getName();	//call Name: name
		animalfarm.feed(dog);	//call feed method and replace pet as dog
	}

}
