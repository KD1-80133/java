package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D()
	{
        this.x = 0.0;
        this.y = 0.0;
    }
	public Point2D(double x, double y)
	{
        this.x = x;
        this.y = y;
    }
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getDetails()
	{
		return "("+x+","+y+")";
	}
	public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    public double calculateDistance(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
    public void accept()
    {
    	Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double newX = Sc.nextDouble(); 
        System.out.print("Enter the value of y: ");
        double newY = Sc.nextDouble();
    }
    public void displayData()
    {
    	System.out.println("Enter x-co-ordinate"+this.x);
    	System.out.println("Enter y-co-ordinate"+this.y);
    }
    
}
