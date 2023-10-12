package com.cars;

public class Drivingcosttest {
	    public static void main(String[] args) {
	        Drivingcost drivingCost = new Drivingcost(0, 0, 0, 0, 0, 0);
	        
	        drivingCost.accept();
	        
	        drivingCost.calculateTotalCost();
	        
	        drivingCost.display();
	    }
	}
