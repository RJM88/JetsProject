package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
		super();
	}

	public FighterJet(String modelOfJet, double rangeOfJet, double speedOfJet, long priceOfJet) {
		super(modelOfJet, rangeOfJet, speedOfJet, priceOfJet);
	}

	@Override
	public void fight() {
		System.out.println(getModelOfJet() + " Is ready to fight!");
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
