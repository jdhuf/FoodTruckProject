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

			System.out.println("Please enter requested information for your food truck.");
			System.out.println();
			System.out.println("Enter \"quit\" for the food truck name to proceed to the menu.");
			System.out.println();
			// name
			System.out.println("What is the name of the food truck?");
			String name = sc.nextLine();

			System.out.println(name);
			System.out.println();
			if (name.equalsIgnoreCase(quit)) {
				break;
			}

			// food type

			System.out.println("What is the food type of the food truck?");
			String foodType = sc.nextLine();
			System.out.println(foodType);
			System.out.println();

			// rating

			System.out.println("What is the rating of the food truck?)");
			System.out.println("Please enter a number 0 to 10.");
			System.out.println("(0 is the worst and 10 is the best)");

			double rating = sc.nextDouble();

			System.out.println(rating);
			System.out.println();
			sc.nextLine();

			FoodTruck tempFoodTruck = new FoodTruck(name, foodType, rating);
			foodTrucks[i] = tempFoodTruck;

		}

		// menu

		String selection;

		while (true) {
			System.out.println("Please select a number from the Menu below.");
			System.out.println("1: List all existing food trucks.");
			System.out.println("2: See the average of all the food trucks' ratings.");
			System.out.println("3: Display the highest-rated food truck.");
			System.out.println("4: Quit the program.");
			System.out.println();

			selection = sc.next();

			if (selection.equals("1")) {
				System.out.println("List of all food trucks:");
				System.out.println();

				for (int i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i] == null) {

					} else {
						System.out.println(foodTrucks[i]);
						System.out.println();
					}

				}

				continue;
			}

			if (selection.equals("2")) {

				double sumOfRatings = 0.0;
				int numOfRatings = 0;
				double averageRating = 0.0;

				System.out.println("Average of food truck ratings:");
				sc.nextLine();

				for (FoodTruck tempRating : foodTrucks) {

					if (tempRating != null) {
						numOfRatings++;
						sumOfRatings += tempRating.getRating();

					}

					averageRating = (sumOfRatings / numOfRatings);

				}

				System.out.println(averageRating);
				System.out.println();

				continue;
			}

			if (selection.equals("3")) {

				double highestRating = 0.0;

				double currentRating = 0.0;

				FoodTruck bestTruck = new FoodTruck();

				for (FoodTruck foodTruck : foodTrucks) {

					if (foodTruck != null) {

						currentRating = foodTruck.getRating();

						if (currentRating > highestRating) {
							highestRating = currentRating;
							bestTruck = foodTruck;
						}
					}
				}

				System.out.println("Highest-rated food truck: ");
				System.out.println();
				System.out.println(bestTruck.toString());
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
