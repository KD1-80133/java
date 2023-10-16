package com.exception;

public class NegativeDiameterException extends Exception{
	NegativeDiameterException()
	{
		super("Circle Diameter Should not be neagative");
	}
}