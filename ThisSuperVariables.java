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
	
	void display1()
	{
		System.out.println("Value is : "+number);
	}
}

class Demo2 extends Demo
{
	int number = 20;
	
	void display()
	{
		System.out.println(number); //this prints current class variable value
		System.out.println(super.number); //this prints parent class variable value
	}
}
public class ThisSuperVariables
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(30);
		d1.display1();
		
		Demo2 d2 = new Demo2();
		d2.display();
	}
}