package Vehicle;

import java.awt.Color;

public class BMW extends Car {

	private String series;
	private int year;
	private String bmwID;
	private String soundSystem;

	// default constructor
	public BMW() {
		super();
		this.series = "";
		this.year = 0;
		this.bmwID = "";
		this.soundSystem = "";
	}
	// constructor with local and all the variables inherited from Car

	public BMW(String series, int year, String bmwID, String soundSystem, String typeOfEngine, boolean sunRoof,
			double horsePower, int speedLimid, String trim) {

		super(typeOfEngine, sunRoof, horsePower, speedLimid, trim);
		this.series = series;
		this.year = year;
		this.bmwID = bmwID;
		this.soundSystem = soundSystem;

	}

	// constructor with local and all the variables inherited from Car and Vehicle
	public BMW(String series, int year, String bmwID, String soundSystem, String typeOfEngine, boolean sunRoof,
			double horsePower, int speedLimid, String trim, String make, String model, int numberOfDoors, double price,
			String name, Color color) {
		super(typeOfEngine, sunRoof, horsePower, speedLimid, trim, make, model, numberOfDoors, price, name, color);

		this.series = series;
		this.year = year;
		this.bmwID = bmwID;
		this.soundSystem = soundSystem;
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

	public String getBmwID() {
		return bmwID;
	}

	public void setBmwID(String bmwID) {
		this.bmwID = bmwID;
	}

	public String getSoundSystem() {
		return soundSystem;
	}
	
	
	public void setSoundSystem(String soundSystem) {
		this.soundSystem = soundSystem;
	}

	
	public String toString() {
		
		return "BMW [" + super.toString() + ", \nseries=" + series + ", year=" + year + ", bmwID=" + bmwID
				+ ", soundSystem=" + soundSystem + "]";
	}
	

}
