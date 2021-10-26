/*Program to implement this and super Keyword*/

import java.util.*;

class Demo
{
	int number = 10;
	
	Demo()
	{
		
	}
	
	Demo(int number1)
	{
		this.number=number1;
	}
	
	void DisplayOne()
	{
		System.out.println("Value is : "+number);
	}
}

class DemoTwo extends Demo
{
	int number = 20;
	
	void DisplayTwo()
	{
		System.out.println(number); //this prints current class variable value
		System.out.println(super.number); //this prints parent class variable value
	}
}
public class ThisSuperVariables
{
	public static void main(String args[])
	{
		Demo demo = new Demo(30);
		demo.DisplayOne();
		
		DemoTwo demoTwo = new Demo2();
		demoTwo.DisplayTwo();
	}
}
