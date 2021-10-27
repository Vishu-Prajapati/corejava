/*Program using static methods*/

class Test
{
	static int numberOne = 10;
	static int numberTwo = 20;
	static int addition;
		
	static void Display() //Static method accesses only static variables
	{
		addition = numberOne + numberTwo;
		System.out.println("Answer is : "+addition);
	}
}

public class StaticMethod
{
	public static void main(String args[])
	{
	    Test test = new Test();
		test.Display();
	}
}
