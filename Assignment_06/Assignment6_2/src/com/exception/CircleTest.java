package com.exception;

public class CircleTest {

	public static void main(String[] args) {
		Circle c=new Circle();
		try
		{
			c.acceptData();
		}
		catch (NegativeDiameterException e) {
			e.printStackTrace();
		}
		c.displayData();
	}

}
