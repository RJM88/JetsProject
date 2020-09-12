package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirPort {

	List<Jet> fleetArray = new ArrayList<>();

	public AirPort() {
		popFleet();
		airPortMenu();
	}

	public void popFleet() {
		try {

			FileReader fr = new FileReader("listOfFleet");
			BufferedReader bufIn = new BufferedReader(fr);
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				 
//					if (fields[0].contains("Cargo")) {
						CargoPlane newJet = new CargoPlane(fields[0], Double.parseDouble(fields[1]),
								Double.parseDouble(fields[2]), Long.parseLong(fields[3]));
						fleetArray.add(newJet);
//						System.out.println(fields[i]);
//					}
				 }
			}
		catch (Exception e) {
			System.err.println(e);
		}
	}
	
	
	public void airPortMenu() {
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
			for (Jet jet : fleetArray) {
				
				if (fleetArray != null) { 
					System.out.println(jet); 
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
//
//			AirPort fastestJet = new AirPort(); // creating a new food truck object.
//			for (AirPort fastestJet : fleetArray) { // for each loop will work through the food truck array.
//
//				if (foodTruck != null && highRatedFoodTruck != null) {
//					if (highRatedFoodTruck.getRating() < foodTruck.getRating()) {
//						highRatedFoodTruck = foodTruck;
//					}
//
//				}
//			}
//			System.out.println("The highest rated food truck is: ");
//			System.out.println(highRatedFoodTruck);
//			break;
////		case 4: // Who can travel the farthest
//
//			FoodTruck highRatedFoodTruck = new FoodTruck(); // creating a new food truck object.
//			for (FoodTruck foodTruck : foodTruckArray) { // for each loop will work through the food truck array.
//
//				if (foodTruck != null && highRatedFoodTruck != null) {
//					if (highRatedFoodTruck.getRating() < foodTruck.getRating()) {
//						highRatedFoodTruck = foodTruck;
//					}
//
//				}
//			}
//			System.out.println("The highest rated food truck is: ");
//			System.out.println(highRatedFoodTruck);
//			break;
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
	}

		kb.close();
	}
}
