/*Program using Data Abstraction*/

abstract class TestOne
{
	abstract void Calculate();
}

class TestTwo extends TestOne
{
	int numberOne;
	int numberTwo;
	
	TestTwo(int numberOne , int numberTwo) //Parameterized Constructor
	{
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	void Calculate()
	{		
		double multiplication = numberOne * numberTwo;
		
		System.out.println("Multiplication is : "+multiplication);
	}
}

public class Abstraction
{
	public static void main(String args[])
	{
		TestTwo testTwo = new TestTwo(12,2);
		testTwo.Calculate();
	}
}

