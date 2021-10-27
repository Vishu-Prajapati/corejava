/*Program to implement this and super Keyword*/

class TestOne
{
	int number = 10;
	int numberOne;
	
	TestOne() //Default Constructor
	{
		
	}
	
	TestOne(int numberOne) //Parameterized Constructor
	{
		this.numberOne = numberOne;
	}
	
	void DisplayOne()
	{
		System.out.println("Value using this variable of parent class is : "+numberOne);
	}
}

class TestTwo extends TestOne
{
	int numberTwo;
	
	TestTwo() //Default Constructor
	{
		
	}
	
	TestTwo(int numberTwo) //Parameterized Constructor
	{
		this.numberTwo = numberTwo;
	}
	
	void DisplayTwo()
	{
		System.out.println("Value using this variable of child class is : "+numberTwo); //this prints current class variable value
		System.out.println("Value using super variable of parent class is : "+super.number); //this prints parent class variable value
	}
}
public class ThisSuperVariables
{
	public static void main(String args[])
	{
		TestOne testOne = new TestOne(30);
		testOne.DisplayOne();
		
		TestTwo testTwo = new TestTwo(20);
		testTwo.DisplayTwo();
	}
}
