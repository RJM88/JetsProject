package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirPort {

	List<Jet> fleetArray = new ArrayList<>();

	public AirPort() {
		popFleet();
	}

	public void popFleet() {
		try {

			FileReader fr = new FileReader("listOfFleet");
			BufferedReader bufIn = new BufferedReader(fr);
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				for (int i = 0; i < fields.length; i++) {
					if (fields[0].contains("Cargo")) {
						CargoPlane newJet = new CargoPlane(fields[0], Double.parseDouble(fields[1]),
								Double.parseDouble(fields[2]), Long.parseLong(fields[3]));
						fleetArray.add(newJet);
						System.out.println(fields[i]);
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
