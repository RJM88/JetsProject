package com.skilldistillery.jet;

import java.util.Scanner;

public class AirPortMenu {

	public AirPortMenu() {
		AirPort airPort = new AirPort();
	
		Scanner kb = new Scanner(System.in);

//		while (commandersChoice != 0) {

			System.out.println("1.) List the Fleet");
			System.out.println("2.) Get all the jets in the air!");
			System.out.println("3.) Who is the fastest in the fleet.");
			System.out.println("4.) Who can travel the farthest.");
			System.out.println("5.) Load all the Casrgo Jets");
			System.out.println("6.) In case of attack, get our fighters in the air.");
			System.out.println("7.) New Jet looking to join the fleet.");
			System.out.println("8.) One of your Jets leaving the fleet.");
			System.out.println("9.) Quit ");
			System.out.println();
			System.out.println("Please chose an option");
			int commandersChoice = kb.nextInt();

			switch (commandersChoice) {
		case 1: // list all jets
			for(int i = 0; i < fleetArray.size; i++) { // for each loop will work through the food truck array.
				if (fleetArray != null) { // if the food truck/ private sting name doesn't == null...
					System.out.println(fleetArray.get[i]); // Will print the truck info from the food truck array.
				}
			}
			break;
//		case 2: // launch all jets
//			for (int i = 0; i < "ARRAYLIST".size; i++) {
//				if (ARRAYLIST != null) { 
//					System.out.println(ARRAYLIST); 
//				}
//			}
//		case 3: // Show the fastest
//			for (int i = 0; i < "ARRAYLIST".size; i++) {
//				if (ARRAYLIST != null) { 
//					System.out.println(ARRAYLIST); 
//				}
//			}
//		case 4: // Who can travel the farthest
//			for (int i = 0; i < "ARRAYLIST".size; i++) {
//				if (ARRAYLIST != null) { 
//					System.out.println(ARRAYLIST); 
//				}
//			}
//		case 5: // Load all cargo
//			for (int i = 0; i < "ARRAYLIST".size; i++) {
//				if (ARRAYLIST != null) { 
//					System.out.println(ARRAYLIST); 
//				}
//			}
//		case 6: // Get all fighters 
//			for (int i = 0; i < "ARRAYLIST".size; i++) {
//				if (ARRAYLIST != null) { 
//					System.out.println(ARRAYLIST); 
//				}
//			}
//		case 7: // Add new jet
//			for (int i = 0; i < "ARRAYLIST".size; i++) {
//				if (ARRAYLIST != null) { 
//					System.out.println(ARRAYLIST); 
//				}
//			}
//		case 8: // Delete Jet
//			for (int i = 0; i < "ARRAYLIST".size; i++) {
//				if (ARRAYLIST != null) { 
//					System.out.println(ARRAYLIST); 
//				}
//			}
//		case 9: // quit
//			System.out.println("Have a good day Commander.");
//			
//			break;
//			
//			defult: 
//				System.out.println("Invalid option, try again.");
//			}
//		}
//	}

		kb.close();
	}
}
