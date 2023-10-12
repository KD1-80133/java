package com.cars;

import java.util.Scanner;

public class Drivingcost {
	int miles;
	int cost;
	int avg;
	int parking;
	int tolls;
	int total_cost;
	
	public Drivingcost(int miles, int cost, int avg, int parking, int tolls, int total_cost)
	{
		this.miles=miles;
		this.cost=cost;
		this.avg=avg;
		this.parking=parking;
		this.tolls=tolls;
		this.total_cost=total_cost;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getParking() {
		return parking;
	}

	public void setParking(int parking) {
		this.parking = parking;
	}

	public int getTolls() {
		return tolls;
	}

	public void setTolls(int tolls) {
		this.tolls = tolls;
	}

	public int getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
	
	public void accept()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the total miles = ");
		this.miles=Sc.nextInt();
		System.out.println("Enter the cost gallon gas");
		this.cost=Sc.nextInt();
		System.out.println("Enter the avrage miles per gallon");;
		this.avg=Sc.nextInt();
		System.out.println("Enter the parking fees");;
		this.parking=Sc.nextInt();
		System.out.println("Enter the Tolls per days");
		this.tolls=Sc.nextInt();
	}
	public void display() {
	    System.out.println("Driving cost details:");
	    System.out.println("Total miles driven per day: " + this.miles);
	    System.out.println("Cost per gallon of gasoline: " + this.cost);
	    System.out.println("Average miles per gallon: " + this.avg);
	    System.out.println("Parking fees per day: " + this.parking);
	    System.out.println("Tolls per day: " + this.tolls);
	    System.out.println("Total cost: " + this.total_cost);
	}
	
	public void calculateTotalCost() {
        int totalCost = (this.miles * this.cost / this.avg) + this.parking + this.tolls;
        this.total_cost = totalCost;
    }
}

