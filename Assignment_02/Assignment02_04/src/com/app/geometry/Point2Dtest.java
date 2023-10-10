package com.app.geometry;

public class Point2Dtest {
	    public static void main(String[] args) {
	        Point2D point1 = new Point2D();
	        System.out.println("First Point");
	        point1.accept();
	        
	        Point2D point2 = new Point2D();
	        System.out.println("Second Point");
	        point2.accept();

	        
	        if (point1.isEqual(point2)) {
	            System.out.println("Point 1 and Point 2 are located at the same position.");
	        } else {
	            double distance = point1.calculateDistance(point2);
	            System.out.println("Point 1 and Point 2 are located at different positions.");
	            System.out.println("Distance between Point 1 and Point 2: " + distance);
	        }
	    }
	}
