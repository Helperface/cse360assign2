package cse360assign2;
/*
 * Author: Richard Vizcarra
 * Class ID: 577
 * Assignment 2
 * 
 * The purpose of the program is to have the calculator class
 * get the total, add to total, subtract from total, multiply
 * total, divide total and get history
 */
public class Calculator 
{
private int total;
private String history="0";

	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () 
	{
		return 0;
	}
	
	public void add (int value) 
	{
		total = total + value;
		history = history + " + " + value;
	}
	
	public void subtract (int value)
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	public void multiply (int value) 
	{
		total = total * value;
		history = history + " * " + value;
	}
	
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	public String getHistory () 
	{
		return "";
	}
}
