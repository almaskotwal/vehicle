package Vehicle;

import java.awt.Color;

public class Car extends Vehicle {
	
	private String typeOfEngine;
	private boolean sunRoof;
	private double horsePower;
	private int speedLimid;
	private String trim;

	public Car() {
		super();
		this.typeOfEngine = "";
		this.sunRoof = false;
		this.horsePower = 0.0;
		this.speedLimid = 0;
		this.trim = "";
	}
	
	
	public Car(String typeOfEngine, boolean sunRoof, double horsePower, int speedLimid, String trim) {
		super();
		this.typeOfEngine = typeOfEngine;
		this.sunRoof = sunRoof;
		this.horsePower = horsePower;
		this.speedLimid = speedLimid;
		this.trim = trim;
	}


	public Car(String typeOfEngine, boolean sunRoof, double horsePower, int speedLimid, String trim, String make,
			String model, int numberOfDoors, double price, String name, Color color) {
		
		super(make, model, numberOfDoors, price, name, color);
		this.typeOfEngine = typeOfEngine;
		this.sunRoof = sunRoof;
		this.horsePower = horsePower;
		this.speedLimid = speedLimid;
		this.trim = trim;
	}


	public String getTypeOfEngine() {
		return typeOfEngine;
	}


	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}


	public boolean isSunRoof() {
		return sunRoof;
	}


	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}


	public double getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}


	public int getSpeedLimid() {
		return speedLimid;
	}


	public void setSpeedLimid(int speedLimid) {
		this.speedLimid = speedLimid;
	}


	public String getTrim() {
		return trim;
	}


	public void setTrim(String trim) {
		this.trim = trim;
	}

	public String toString() {
		return super.toString()+ ", \ntypeOfEngine=" + typeOfEngine + ", sunRoof=" + sunRoof + ", horsePower=" + horsePower
				+ ", speedLimid=" + speedLimid + ", trim=" + trim;
	}
	
	

}




