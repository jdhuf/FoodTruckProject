package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 10;
	private String name;
	private String foodType;
	private double rating;
	private int truckId;
	
	public FoodTruck( ) {}

	public FoodTruck(String name, String foodType, double rating) {

		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = nextTruckId;
		nextTruckId++;
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
	
	public String toString() {
		return "name = " + name + ", food type = " + foodType + ", rating = " + rating
				+ " Id = " + truckId;
	}
	
	public void displayFoodTruck() {
		String truckData = toString();
		System.out.println(truckData);
	}
	
	
}


