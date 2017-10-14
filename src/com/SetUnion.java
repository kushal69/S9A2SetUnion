package com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//	Main Class SetUnion implemented to make the UNION of two sets
public class SetUnion {
	//	Method which displays the elements of the set which does union of SETS using addAll method of Set Interface and 
	//	also displays the elements of the set after union
	//	@param set1 = Contains the String Elements of the user entered to Set One
	//	@param set2 = Contains the String Elements of the user entered to Set Two
	public void getUnioinOfSet(Set<String> set1, Set<String> set2) {

		System.out.println("Elements of 'Set One' : " + set1);			//	Displays the Elements in Set One
		System.out.println("Elements of 'Set Two' : " + set2);			//	Displays the Elements in Set Two

		set1.addAll(set2);												//	Doing the Union of Set One and Set Two. Set One contains the Union of both the Sets

		System.out.println("Elements of 'Set One' After Union of 'Set One' and 'Set Two' : " + set1);	//	Displaying Elements of Set One after doing Union
	}

	//	Main method which takes the user input based on the choice which will be provided and calls the getUnionOfSet method to Union
	public static void main(String[] args) {
		SetUnion setUnion = new SetUnion();								//	Class object to invoke union method
		Scanner userInput = new Scanner(System.in);						//	Scanner object to take the user input from the console

		Set<String> set1 = new HashSet<String>();						//	Declaration of Set1 Set which stores String type Elements
		Set<String> set2 = new HashSet<String>();						//	Declaration of Set2 Set which stores String type Elements

		int choice = 0;													//	Declaring the choice element to store the user entered choice

		while (true) {													//	Infinite Loop to get the user input until it is user interpreted.
			System.out.print("Enter 1. Add Elements in 'Set One' 2. Add Elements in 'Set Two' 3. Display Elements of Sets 4. Exit : ");	//	Displaying options

			choice = userInput.nextInt();								//	Getting the choice from the user

			if (choice == 1) {											//	If Choice is 1 then user can enter values to Set1
				System.out.print("Enter a String value to add in 'Set One' : ");

				userInput.nextLine();
				set1.add(userInput.nextLine());							//	Adding the user entered value to Set1
			} else if (choice == 2) {									//	If Choice is 2 then user can enter values to Set2
				System.out.print("Enter a String value to add in 'Set Two' : ");

				userInput.nextLine();
				set2.add(userInput.nextLine());							//	Adding the user entered value to Set2
			} else if (choice == 3) {									//	If Choice is 3 All Set elements are displayed
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				setUnion.getUnioinOfSet(set1, set2);					//	Invoking getUnioinOfSet method which does union of the set1 and set2 displaying same
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
			} else if (choice == 4) {									//	If Choice is 4 Exiting from the infinite loop
				System.out.println("Exited ............... ");
				break;
			} else {													//	If User Enters any choice other than the provided
				System.out.println("Enter a Valid Choice ................ ");
				continue;
			}
		}

		userInput.close();												//	Closing the scanner stream to handle memory leak
	}
}