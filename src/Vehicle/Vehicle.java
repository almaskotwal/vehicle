package Vehicle;

import java.awt.Color;

public class Vehicle {

	private int numberOfDoors;
	private String make;
	private String model;
	private double price;
	private String name;
	private Color color;

	public Vehicle() {
		this.numberOfDoors = 0;
		this.make = "";
		this.model = "";
		this.price = 0.0;
		this.name = "";
		this.color = Color.BLACK;
	}

	public Vehicle(String make) {
		this();
		this.make = make;
	}

	public Vehicle(String model, String make) {
		this(make);
		this.model = model;
	}

	public Vehicle(String make, String model, int numberOfDoors) {
		this(model, make);
		this.numberOfDoors = numberOfDoors;
	}

	public Vehicle(String make, String model, int numberOfDoors, double price) {
		this(make, model, numberOfDoors);
		this.price = price;
	}

	public Vehicle(String make, String model, int numberOfDoors, double price, String name, Color color) {
		this(make, model, numberOfDoors, price);
		this.name = name;
		this.color = color;
	}

	
	
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString() {
		
		return "numberOfDoors=" + numberOfDoors + ", make=" + make + ", model=" + model + ", price=" + price
				+ ", name=" + name + ", color=" + color ;
	}

	
	
}
