package myMaven;

import java.util.Arrays;

public class Vegetable {

	private String vegItems[];
	private Fruit  fruits[];
	
	
	private Vegetable() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Vegetable class created");
	}

	public String[] getVegItems() {
		return vegItems;
	}

	public void setVegItems(String[] vegItems) {
		this.vegItems = vegItems;
	}

	public Fruit[] getFruits() {
		return fruits;
	}

	public void setFruits(Fruit[] fruits) {
		this.fruits = fruits;
	}

	public String talkAboutYourself() {
		return "Hello I am Vegetable. I am a plant that is used as a food. List of vegetables are: " + Arrays.toString(vegItems) + " and fruits are: " + getFruiDetails();
	}
	
	public String getFruiDetails() {
		
		String allFruits = "";
		for (Fruit fruit : fruits) {
			allFruits +=  fruit.getFruitName() + ", ";
		}
		
		allFruits += "Apple";
		
		return allFruits;
	}
	
}
