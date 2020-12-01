package Vehicle;

import java.awt.Color;

public class Benz extends Car {

	private String series;
	private int year;
	private String benzID;
	private boolean heatingCoolingSeat;
	private boolean tirePressureMonitor;

	
	
	
	public Benz(String series, int year, String benzID, boolean heatingCoolingSeat, boolean tirePressureMonitor,
			String typeOfEngine, boolean sunRoof, double horsePower, int speedLimid, String trim) {
		super(typeOfEngine, sunRoof, horsePower, speedLimid, trim);
		this.series = series;
		this.year = year;
		this.benzID = benzID;
		this.heatingCoolingSeat = heatingCoolingSeat;
		this.tirePressureMonitor = tirePressureMonitor;
	}

	public Benz(String series, int year, String benzID, boolean heatingCoolingSeat, boolean tirePressureMonitor,
			String typeOfEngine, boolean sunRoof, double horsePower, int speedLimid, String trim, String make,
			String model, int numberOfDoors, double price, String name, Color color) {
		super(typeOfEngine, sunRoof, horsePower, speedLimid, trim, make, model, numberOfDoors, price, name, color);
		this.series = series;
		this.year = year;
		this.benzID = benzID;
		this.heatingCoolingSeat = heatingCoolingSeat;
		this.tirePressureMonitor = tirePressureMonitor;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBenzID() {
		return benzID;
	}

	public void setBenzID(String benzID) {
		this.benzID = benzID;
	}

	public boolean isHeatingCoolingSeat() {
		return heatingCoolingSeat;
	}

	public void setHeatingCoolingSeat(boolean heatingCoolingSeat) {
		this.heatingCoolingSeat = heatingCoolingSeat;
	}

	public boolean isTirePressureMonitor() {
		return tirePressureMonitor;
	}

	public void setTirePressureMonitor(boolean tirePressureMonitor) {
		this.tirePressureMonitor = tirePressureMonitor;
	}

	
	public String toString() {
		return "Benz [" + super.toString() + "\nseries=" + series + ", year=" + year + ", benzID=" + benzID
				+ ", heatingCoolingSeat=" + heatingCoolingSeat + ", tirePressureMonitor=" + tirePressureMonitor + "]";
	}


}
