package com.skilldistillery.foodtruck.app;

import java.util.Scanner;


import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck[] foodTrucks = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();

	}

	// app run
	public void run() {

		Scanner sc = new Scanner(System.in);

		String quit = "quit";

		// initial loop
		for (int i = 0; i < 5; i++) {

			System.out.println("Please enter requested information for your food truck. \n"
					+ "Enter \"quit\" for the food truck name to proceed to the menu.\n");

			// name
			System.out.println("What is the name of the food truck?");
			String name = sc.nextLine();

			System.out.println(name);
			if (name.equalsIgnoreCase(quit)) {
				break;
			}

			// food type
			System.out.println("What is the food type of the food truck?");
			String foodType = sc.nextLine();
			System.out.println(foodType);

			// rating
			System.out.println("What is the rating of the food truck? \n" + "(0 is the worst and ten is the best)");
			
			
			double rating = sc.nextDouble();
			System.out.println(rating);
			sc.nextLine();

			FoodTruck tempFoodTruck = new FoodTruck(name, foodType, rating);
			foodTrucks[i] = tempFoodTruck;
			
		//    System.out.println(foodTrucks[i].getName());
		}

		// menu

		String selection;

		while (true) {
			System.out.println("Please select a number from the Menu below.");
			System.out.println("1: List all existing food trucks.");
			System.out.println("2: See the average rating of food trucks.");
			System.out.println("3: Display the highest-rated food truck.");
			System.out.println("4: Quit the program.");
			System.out.println();

			selection = sc.next();

			if (selection.equals("1")) {
				System.out.println("food truck listing");
				System.out.println();

				for (int i = 0; i < foodTrucks.length; i++) {
					//if (foodTrucks[i].getName() != null) {
					System.out.println(foodTrucks[i].getName());
					}
			//	}
				continue;
			}

			if (selection.equals("2")) {
				System.out.println("average rating");
				System.out.println();
				
				for (int i = 0; i < foodTrucks.length; i++) {
					//if (foodTrucks[i].getName() != null) {
					System.out.println(foodTrucks[i].getRating());
					}
				
				continue;
			}

			if (selection.equals("3")) {
				System.out.println("highest-rated");
				System.out.println();
				continue;

			}
			if (selection.equals("4")) {
				System.out.println("Goodbye!");
				break;

			} else {
				System.out.println("Invalid entry.");
				System.out.println();
			}

		}
		sc.close();
	}

}
