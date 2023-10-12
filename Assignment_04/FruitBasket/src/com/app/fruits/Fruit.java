package com.app.fruits;

import java.util.*;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruit() 
	{
	}
	
	public Fruit(String name, String color, double weight, boolean isFresh) 
	{
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public void acceptFruit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of fruit = ");
		this.name=sc.next();
		System.out.println("Enter the color of fruit = ");
		this.color=sc.next();
		System.out.println("Enter the Weight of fruit = ");
		this.weight=sc.nextDouble();
		System.out.println("Is the fruit fresh? (true or false): ");
		this.isFresh = sc.nextBoolean();
	}
	public void displayFruit() 
	{
		System.out.println("Name Of Fruit = "+this.name);
		System.out.println("color Of Fruit = "+this.color);
		System.out.println("Weight Of Fruit = "+this.weight);
		System.out.println("fruit is fresh = "+this.isFresh);
		
	}

	public String taste() {
		
		return "not taste";
	}
}
