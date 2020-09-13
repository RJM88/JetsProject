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

				if (fields[4].contains("Cargo")) {
					CargoPlane newCarJet = new CargoPlane(fields[0], Double.parseDouble(fields[1]),
							Double.parseDouble(fields[2]), Long.parseLong(fields[3]));
					fleetArray.add(newCarJet);
				}

				else if (fields[4].contains("Fighter")) {
					FighterJet newFightJet = new FighterJet(fields[0], Double.parseDouble(fields[1]),
							Double.parseDouble(fields[2]), Long.parseLong(fields[3]));
					fleetArray.add(newFightJet);
				}

				if (fields[4].contains("Passenger")) {
					PassengerJet newPassJet = new PassengerJet(fields[0], Double.parseDouble(fields[1]),
							Double.parseDouble(fields[2]), Long.parseLong(fields[3]));
					fleetArray.add(newPassJet);
				}

			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void airPortMenu() {
		Scanner kb = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {

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
			kb.nextLine();
			switch (commandersChoice) {

			case 1: // list all jets
				for (Jet jet : fleetArray) {
					if (fleetArray != null) {
						System.out.println(jet);
					}
				}
				System.out.println();
				break;

			case 2: // launch all jets
				for (Jet jet : fleetArray) {
					if (fleetArray != null) {
						jet.fly();
					}
				}
				System.out.println();
				break;
			case 3: // Show the fastest

				Jet speedJet = fleetArray.get(0);
				for (int i = 0; i < fleetArray.size(); i++) {
					Jet speedJetTracker = fleetArray.get(i);
					if (speedJet.getSpeedOfJet() < speedJetTracker.getSpeedOfJet()) {
						speedJet = speedJetTracker;
					}
				}
				System.out.println(speedJet);
				System.out.println();
				break;

			case 4: // Who can travel the farthest
				Jet distanceOfJet = fleetArray.get(0);
				for (int i = 0; i < fleetArray.size(); i++) {
					Jet rangeJetTracker = fleetArray.get(i);
					if (distanceOfJet.getRangeOfJet() < rangeJetTracker.getRangeOfJet()) {
						distanceOfJet = rangeJetTracker;
					}
				}
				System.out.println(distanceOfJet);
				System.out.println();
				break;

			case 5: // Load all cargo
				for (Jet jet : fleetArray) {
					if (jet instanceof CargoCarrier) {
						((CargoCarrier) jet).loadCargo();
					} else {
						continue;
					}

				}
				break;

			case 6: // Get all fighters
				for (Jet jet : fleetArray) {
					if (jet instanceof CombatReady) {
						((CombatReady) jet).fight();
					} else {
						continue;
					}

				}
				break;

			case 7: // Add new jet
				System.out.print("is your jet a Fighter, Cargo, or Passanger: ");
				String jetType = kb.nextLine();
				jetType = jetType.toLowerCase();
				System.out.println();
				System.out.print("Please enter the name of your jet: ");
				String jetName = kb.nextLine();
				System.out.print("Please enter the range of your jet: ");
				double jetRange = kb.nextDouble();
				System.out.print("Please enter the speed of your jet: ");
				double jetSpeed = kb.nextDouble();
				System.out.print("Please enter the price of your jet: ");
				long jetPrice = kb.nextLong();
				if (jetType.contentEquals("fighter")) {
					this.fleetArray.add(new FighterJet(jetName, jetRange, jetSpeed, jetPrice));
				}

				if (jetType.contentEquals("cargo")) {
					this.fleetArray.add(new CargoPlane(jetName, jetRange, jetSpeed, jetPrice));

				}
				if (jetType.contentEquals("passanger")) {
					this.fleetArray.add(new PassengerJet(jetName, jetRange, jetSpeed, jetPrice));

				}
				System.out.println();
				break;

			case 8: // Delete Jet
//			for( int i = 0; i < fleetArray.size(); i++) {
				int i = 1;
				for (Jet jet : fleetArray) {

					System.out.println(i + " " + jet.getModelOfJet());
					i++;
					System.out.println();
				}

				System.out.println("Please select ship number to delete: ");
				int deleteShip = kb.nextInt();

				this.fleetArray.remove(deleteShip - 1);

				break;
			case 9:
				System.out.println("Good Bye!"); // Will display Good Bye,
				// Change the quit boolean to true. When the quit boolean = true, it will break
				// out of the while loop and end the program.
				quit = true;
				break;
			default:
				System.out.println("Not valid"); // Will display if user input does not match any cases.
			}
		}

		kb.close();
	}
}
