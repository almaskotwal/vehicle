package Vehicle;

import java.awt.Color;

public class Runner {

	public static void main(String[] args) {

		BMW obj1 = new BMW("X", 2020, "basd32eas4", "good one", "something", true, 50000, 250, "XL");
		Benz obj2 = new Benz("C", 2020, "sdfw34sdf", true, true, "Gas", true, 458000, 350, "XL");
	
		Benz obj3 = new Benz("C", 2019, "saf3sdf23323", false, true, "Gas", true, 451200, 252, "L", "Benz", "C Class",
				4, 35000, "The fancy one", Color.WHITE);
		
	
		
		Vehicle[] cars = {obj1, obj2, obj3};
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
			System.out.println();
		}
		
	}

}
