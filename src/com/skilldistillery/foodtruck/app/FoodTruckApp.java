package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		// array of food trucks (fleet), menu, don't ask user for id, id will not be parameter to any methods. id will only be displayed
		Scanner sc = new Scanner(System.in);
		
		String quit = "Q";
		
		//loop
		//while (false) {
			
		//	if (q not entered ) {
		
		System.out.println("Please enter requested information for your food truck. \n"
				+ "Enter Q to quit. \n");
	
		
		//name
		System.out.println("What is the name of the food truck?");
		String name = sc.nextLine();
		System.out.println(name);
		
		//food type
		System.out.println("What is the food type of the food truck?");
		String foodType = sc.nextLine();
		System.out.println(foodType);
		
		System.out.println("What is the rating of the food truck? \n"
				+ "(0 is the worst and ten is the best)" );
		double rating = sc.nextInt();
		System.out.println(rating);
		

		
	//		} else {
	//			quit and continue
			}
		}

	


