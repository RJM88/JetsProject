package com.skilldistillery.jet;

public abstract class Jet {
	private String modelOfJet;
	private double rangeOfJet;
	private double speedOfJet;
	private double speedInMach;

	public void setSpeedInMach(double speedInMach) {
		this.speedInMach = speedInMach;
	}

	private long priceOfJet;

	public Jet() {
		super();
	}

	public Jet(String modelOfJet, double rangeOfJet, double speedOfJet, long priceOfJet) {
		super();
		this.modelOfJet = modelOfJet;
		this.rangeOfJet = rangeOfJet;
		this.speedOfJet = speedOfJet;
		this.priceOfJet = priceOfJet;
	}

	public String getModelOfJet() {
		return modelOfJet;
	}

	public void setModelOfJet(String modelOfJet) {
		this.modelOfJet = modelOfJet;
	}

	public double getRangeOfJet() {
		return rangeOfJet;
	}

	public void setRangeOfJet(double rangeOfJet) {
		this.rangeOfJet = rangeOfJet;
	}

	public double getSpeedOfJet() {
		return speedOfJet;
	}

	public void setSpeedOfJet(double speedOfJet) {
		this.speedOfJet = speedOfJet;
	}

	public long getPriceOfJet() {
		return priceOfJet;
	}

	public void setPriceOfJet(long priceOfJet) {
		this.priceOfJet = priceOfJet;
	}

	public void fly() {

		System.out.println(modelOfJet + " up and flying!");
		System.out.println("I can go a speed of: " + speedOfJet);
		System.out.println("I have a range of: " + rangeOfJet);
		System.out.printf("I can fly for " + "%.2f", (rangeOfJet / speedOfJet));
		System.out.println(" hours!");
		System.out.println("I'll cost you about: $" + priceOfJet);
		System.out.println();
	}

	public double getSpeedInMach() {
		return speedInMach;
	}

	@Override
	public String toString() {
		return "Jet [modelOfJet=" + modelOfJet + ", rangeOfJet=" + rangeOfJet + ", speedOfJet=" + speedOfJet
				+ ", priceOfJet=" + priceOfJet + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelOfJet == null) ? 0 : modelOfJet.hashCode());
		result = prime * result + (int) (priceOfJet ^ (priceOfJet >>> 32));
		long temp;
		temp = Double.doubleToLongBits(rangeOfJet);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(speedOfJet);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		if (modelOfJet == null) {
			if (other.modelOfJet != null)
				return false;
		} else if (!modelOfJet.equals(other.modelOfJet))
			return false;
		if (priceOfJet != other.priceOfJet)
			return false;
		if (Double.doubleToLongBits(rangeOfJet) != Double.doubleToLongBits(other.rangeOfJet))
			return false;
		if (Double.doubleToLongBits(speedOfJet) != Double.doubleToLongBits(other.speedOfJet))
			return false;
		return true;
	}

}