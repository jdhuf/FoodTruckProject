package com.skilldistillery.foodtruck.entities;


public class FoodTruck {
	private static int nextTruckId;
	private String name;
	private String foodType;
	private double rating;
	
	public FoodTruck (int nextTruckId, String name, String foodType, double rating) {

		this.nextTruckId = nextTruckId;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;

	}
	
	
	public int getNextTruckId() {
		return nextTruckId;
	}
	public void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	//Parking Lot Example
	private int numFoodTrucks;
	private FoodTruck[] foodTrucks;
	private final int MAX_FOODTRUCKS = 5;
	
	//???? FoodTruck works but FoodTruckArray doesn't
	
	public FoodTruck () {
		foodTrucks = new FoodTruck[MAX_FOODTRUCKS];
	}

	public void displayFoodTrucks() {
		for (FoodTruck foodTruck : foodTrucks) {
			if (foodTruck != null) {
				System.out.println("We have these " + foodTruck.getName() );
			}
		}
	}

	public FoodTruck[] getFoodTrucks() {
		FoodTruck [] lotCopy = new FoodTruck[foodTrucks.length];
		for (int i = 0; i < foodTrucks.length; i++) {
			lotCopy[i] = foodTrucks[i];
		}
		return foodTrucks;
	}

	public void addFoodTruck(FoodTruck foodTruckToAdd) {
		if (numFoodTrucks == MAX_FOODTRUCKS) {
			System.out.println("No more food trucks.");
		} else {
			for (int spot = 0; spot < MAX_FOODTRUCKS; spot++) {
				if (foodTrucks[spot] == null) {
					foodTrucks[spot] = foodTruckToAdd;
					numFoodTrucks++;
					break;
				}
			}
		}
	}

	
	
	
	
}
