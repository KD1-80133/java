package com.exception;

import java.util.Scanner;

public class Circle {
	private Point2D centerpoint;
	private double diameter;
	
	public Circle() {
		centerpoint = new Point2D(0,0);
		diameter=100;
	}

	public Point2D getCenterpoint() {
		return centerpoint;
	}

	public void setCenterpoint(Point2D centerpoint) {
		this.centerpoint = centerpoint;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public void acceptData() throws NegativeDiameterException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Diameter : ");
		this.diameter=sc.nextDouble();
		if(this.diameter<0)
		{
			throw new NegativeDiameterException();
		}
		centerpoint.acceptData();
	}
	public void displayData() {
		System.out.println("Circle Diameter : "+this.diameter);
		centerpoint.displayData();
	}
}
