package com.skilldistillery.jet;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
	}

	public CargoPlane(String modelOfJet, double rangeOfJet, double speedOfJet, long priceOfJet) {
		super(modelOfJet, rangeOfJet, speedOfJet, priceOfJet);
	}

	@Override
	public void loadCargo() {
		System.out.println("Cargo has been loaded onto " + getModelOfJet());

	}

}
