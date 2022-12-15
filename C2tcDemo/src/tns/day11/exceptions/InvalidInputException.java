package tns.day11.exceptions;

import java.util.Arrays;

public class InvalidInputException extends Exception{
	public InvalidInputException()
	{
		super("Invalid data");
	}
	InvalidInputException(String msg)
	{
		super(msg);
	}
	@Override
	public String toString() {
		return "InvalidInputException : " + getMessage() ;
	}
	
}
