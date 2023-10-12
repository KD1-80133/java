package com.geometry;

import java.util.Scanner;

public class Point2D 
{
	private int x_point;
	private int y_point;
	
	public Point2D() 
	{
		this.x_point = 0;
		this.y_point = 0;
	}

	public Point2D(int x_point, int y_point) {
		
		this.x_point = x_point;
		this.y_point = y_point;
	}

	public int getX_point() {
		return x_point;
	}

	public void setX_point(int x_point) {
		this.x_point = x_point;
	}

	public int getY_point() {
		return y_point;
	}

	public void setY_point(int y_point) {
		this.y_point = y_point;
	}
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate");
		this.x_point = sc.nextInt();
		System.out.println("Enter y co-ordinate");
		this.y_point = sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("["+this.x_point+","+this.y_point+"]");
	}
	
	public String getDetails_x()
	{
		String x_string = Integer.toString(this.x_point);
		return x_string;
		
	}
	
	public String getDetails_y()
	{		
		String y_string = Integer.toString(this.y_point);
		return y_string;
	}
	
	public boolean isEqual(Point2D p2)
	{
		if(this.x_point == p2.x_point && this.y_point == p2.y_point)
			return true;
			else 
				return false;
	}
	
	public void calculateDistance(Point2D p2)
	{
		double distance = Math.sqrt((Math.pow(p2.x_point-this.x_point, 2)) + (Math.pow(p2.y_point-this.y_point, 2)));
		System.out.println("Distance between two points is : "+distance);
	}

}